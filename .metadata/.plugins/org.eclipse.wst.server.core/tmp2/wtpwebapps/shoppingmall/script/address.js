$(document).ready(function() {
			$("#postcode1").on("click", addressDAUM);
			$("#postcode2").on("click", addressDAUM);
			$("#addressBtn").on("click", addressDAUM);

			// 주소
			$("#addressDetail").keydown(function() {
				$("#addressErr").hide();
			});

			$("#addressDetail").blur(function() {
						if ($("#address").val().trim() == '') {
							$("#addressErr").show().html("필수 정보입니다").attr(
									'style', "color:red");
							$("#address").val('');
							return false;
						} else {
							$("#addressErr").html('').hide();
						}
			});
});

function addressDAUM() {
	new daum.Postcode({
		oncomplete : function(data) {
			$("#postcode1").val(data.postcode1);
			$("#postcode2").val(data.postcode2);
			$("#address").val(data.address);
		}
	}).open();
}
