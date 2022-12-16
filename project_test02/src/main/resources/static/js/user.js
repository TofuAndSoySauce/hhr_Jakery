let index = {
	init: function() {
		$("#registerbtn-save").on("click", () => {
			this.save();
		});
		/*$("#btn-login").on("click",()=>{
			this.login();
		});*/
		$("#registerbtn-update").on("click", () => {
			this.update();
		});
	},
	save: function() {
		//alert('user의 save함수 호출됨');
		let data = {
			userid: $("#userid").val(),
			username: $("#username").val(),
			password: $("#password").val(),
			email: $("#email").val(),
			address: $("#address").val(),
			postnum: $("#postnum").val(),
			subaddress: $("#subaddress").val()
		};

		$.ajax({
			type: "POST",
			url: "/auth/joinProc",
			data: JSON.stringify(data),
			contentType: "application/json; charset=utf-8",
			dataType: "json"
		}).done(function(data, status) {
			console.log(data);
			alert("회원가입이 완료되었습니다.");
			location.href = "/";
		}).fail(function(error) {
			alert(JSON.stringify(error));
		});
	},
	/*update: function(){
		let data={
			id: $("#id").val(),
			password: $("#password").val(),
			email: $("#email").val(),
		};

		$.ajax({ 
			type:"PUT",
			url:"/user",
			data:JSON.stringify(data), //http body 데이터
			contentType:"application/json; charset=utf-8",
			dataType:"json" //자동으로 변환해주기 때문에 생략 가능
			//응답의 결과가 문자열이 아닌 json으로 변환
		}).done(function(resp){		
				alert("회원정보 수정이 완료되었습니다.");
			location.href="/";
			//응답이 정상
		}).fail(function(error){
			alert(JSON.stringify(error));
			//응답이 비정상
		});
	},*/
}


index.init();
