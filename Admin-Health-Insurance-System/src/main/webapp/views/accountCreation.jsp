<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet" href="../bootstrap/css/bootstrap-grid.min.css">
<link rel="stylesheet" href="../bootstrap/css/bootstrap.min.css">
<script type="text/javascript"
	src="../bootstrap/js/bootstrap.bundle.min.js"></script>
<script type="text/javascript" src="../bootstrap/js/bootstrap.min.js"></script>
<script type="text/javascript"
	src="../bootstrap/js/jquery-3.2.1.slim.min.js"></script>
<script type="text/javascript" src="../bootstrap/popper.min.js"></script>
<title>HIS-Account Creation</title>
</head>
<body>
	<div class="container">
		<div class="card">
			<div class="card-header bg-primary text-white">
				<h2>CREATE ACCOUNT</h2>
			</div>
			<!-- CARD HEAD END -->
			<div class="card-body">
				<form:form action="createAccount" method="post"
					modelAttribute="account">


					<div class="form-group">
						<label for="firstName" class="control-label col-sm-4">First
							Name</label>
						<form:input path="firstName" cssClass="form-control col-sm-4" />
					</div>
					<div class="form-group">
						<label for="lastName" class="control-label col-sm-4">Last
							Name</label>
						<form:input path="lastName" cssClass="form-control col-sm-4" />
					</div>
					<div class="form-group">
						<label for="emailId" class="control-label col-sm-4">Email
							Id</label>
						<form:input path="emailId" cssClass="form-control col-sm-4" />
					</div>
					<div class="form-group">
						<label for="gender" class="control-label">Gender</label><br/>
						<form:radiobutton path="gender" value="M" label="Male" />
						<form:radiobutton path="gender" value="F" label="Female"/>
					</div>

					<div class="form-group">
						<label for="role" class="control-label col-sm-4">Role</label>
						<form:select path="role" cssClass="form-control col-sm-4">
							<form:option value="">--Select--</form:option>
							<form:options items="${accRoles}" />
						</form:select>
					</div>

					<input type="submit" value="Create Account" class="btn btn-success" />

				</form:form>
			</div>
			<!-- CARD BODY END -->
			<c:if test="${null!=msg}">
				<div class="card-footer bg-success text-white">
					<b>${msg}</b>
				</div>
				<!--CARD FOOTER END -->
			</c:if>
		</div>
		<!--CARD END -->
	</div>
	<!-- CONTAINER END -->
</body>
</html>