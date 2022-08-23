<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>회원가입 폼</title>
	<!-- Bootstrap CDN -->
	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.1.0/css/bootstrap.min.css">
	<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
	<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.1.0/js/bootstrap.min.js"></script>
</head>

  <body class="bg-light">
    
<div class="container">
  <main>
    <div class="py-5 text-center">
      <h2>회원가입</h2>
      <p class="lead">이메일과 닉네임은 필수입니다</p>
    </div>

    <div class="row g-5">
      <div class="col-md-7 col-lg-8 m-auto">
        <h4 class="mb-3">회원 정보</h4>
        <form class="needs-validation" novalidate>
          <div class="row g-3">
          
            <div class="col-12">
              <label for="nickname" class="form-label">닉네임</label>
              <div class="input-group has-validation">
                <!-- <span class="input-group-text">@</span> -->
                <input type="text" class="form-control" id="nickname" placeholder="nickname" required>
              <div class="invalid-feedback">
                  Your nickname is required.
                </div>
              </div>
            </div>

            <div class="col-12">
              <label for="email" class="form-label">Email </label>
              <input type="email" class="form-control" id="email" placeholder="you@example.com">
              <div class="invalid-feedback">
                Please enter a valid email address for shipping updates.
              </div>
            </div>
          
            <div class="col-sm-6">
              <label for="password" class="form-label">비밀번호</label>
              <input type="text" class="form-control" id="password" placeholder="" value="" required>
              <div class="invalid-feedback">
                Valid first password is required.
              </div>
            </div>

            <div class="col-sm-6">
              <label for="password-chk" class="form-label">비밀번호 확인</label>
              <input type="text" class="form-control" id="password-chk" placeholder="" value="" required>
              <div class="invalid-feedback">
                Valid last name is required.
              </div>
            </div>


            <div class="col-12">
              <label for="addr" class="form-label">Address <span class="text-muted">(Optional)</span></label>
              <input type="text" class="form-control" id="addr" placeholder="1234 Main St" >
              <div class="invalid-feedback">
                Please enter your shipping address.
              </div>
            </div>

            <div class="col-12">
              <label for="phone" class="form-label">전화번호 <span class="text-muted">(Optional)</span></label>
              <input type="text" class="form-control" id="phone" placeholder="010-1234-5678">
            </div>

          </div>

          <hr class="my-4">

          <div class="form-check">
            <input type="checkbox" class="form-check-input" id="same-address">
            <label class="form-check-label" for="same-address">Shipping address is the same as my billing address</label>
          </div>

          <div class="form-check">
            <input type="checkbox" class="form-check-input" id="save-info">
            <label class="form-check-label" for="save-info">Save this information for next time</label>
          </div>

          <hr class="my-4">

          <button class="w-100 btn btn-primary btn-lg" type="submit">회원등록</button>
        </form>
      </div>
    </div>
  </main>

  <footer class="my-5 pt-5 text-muted text-center text-small">
    <p class="mb-1">&copy; 2022-08-23 Company BM</p>
    <ul class="list-inline">
      <li class="list-inline-item"><a href="#">Privacy</a></li>
      <li class="list-inline-item"><a href="#">Terms</a></li>
      <li class="list-inline-item"><a href="#">Support</a></li>
    </ul>
  </footer>
</div>


</body>

</html>