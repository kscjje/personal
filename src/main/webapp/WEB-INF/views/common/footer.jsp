<%@ page contentType="text/html; charset=utf-8" language="java"%>
	
<div class="bg-gnb" style="display: none; opacity: 1;"></div>
<div class="bg-search" style="display: none;"></div>
<div id="footer">
	<div class="inner">
		<div class="foot1">
			<div class="logo">기장군도시관리공단</div>
			<div class="info">
				<dl>
					<dt>주소</dt>
					<dd>(08888) 부산시 기장군 0000로 110길</dd>
				</dl>
				<dl>
					<dt>대표번호</dt>
					<dd>000-1234-5667</dd>
				</dl>
				<dl>
					<dt>FAX</dt>
					<dd>000-1234-5667</dd>
				</dl>
			</div>
			<div class="family">
				<select class="select-family">
					<option>관련 사이트 바로가기</option>
				</select>
			</div>
		</div>
		<div class="menu">
			<a href="/gijang/common/terms">이용약관</a>
			<a href="/gijang/common/privacy">개인정보 처리방침</a>
			<!-- 
			<a href="#">이메일 무단수집거부</a>
			 -->
		</div>
	</div>
</div>



	<div class="app-wrap popup-wrap mobile-floating-type" style="z-index:10000;background:#ffffff;" id="mobile_app_set">
	
		<div class="app-m-header ">
			<div class="fixed">
				<h1><a href="javascript:popupClose('mobile_app_set');"><i class="ico-head-arr left"></i> <span>설정</span> </a></h1>
			</div>
		</div>
		<!-- // 앱 헤더 -->


		<div id="app-container">
			<div class="inner">
				<h2 class="app-join-h2 mb20">이용시설 관리</h2>
				
				<div class="app-information2">
					<dl class="align-items-center mb16">
						<dt class="text500">정관 아쿠아드림파크 (이용중)</dt>
						<dd>
							<label><input type="checkbox" class="switch"><div><em></em></div></label>
						</dd>
					</dl>
					<dl class="align-items-center mb20">
						<dt class="text500">군포 청소년 수련관</dt>
						<dd>
							<label><input type="checkbox" class="switch"><div><em></em></div></label>
						</dd>
					</dl>
				</div>
				<button class="btn btn-line-black app block ">등록한 이용시설 관리하기</button>
				
				<hr class="app-hr1 app-mb20">
				
				<h2 class="app-join-h2 mb20">보안설정</h2>
				
				<div class="app-information2">
					<dl class="align-items-center mb16">
						<dt class="text500">간편 비밀번호 사용</dt>
						<dd>
							<label><input type="checkbox" id="appIpinSet" name="appIpinSet" onclick="goAppIpinSet()" class="switch"><div><em></em></div></label>
						</dd>
					</dl>
					<dl class="align-items-center mb20">
						<dt class="text500">생체정보 사용</dt>
						<dd>
							<label><input type="checkbox" id="appBiometrics" name="appBiometrics" onclick="goAppBiometrics()" class="switch"><div><em></em></div></label>
						</dd>
					</dl>
				</div>
				
				<hr class="app-hr1 app-mb20">
				
				<h2 class="app-join-h2 mb20">알림설정</h2>
				
				<div class="app-information2">
					<dl class="align-items-center mb16">
						<dt class="text500">푸시알림 사용</dt>
						<dd>
							<label><input type="checkbox" class="switch"><div><em></em></div></label>
						</dd>
					</dl>
					<dl class="align-items-center mb20">
						<dt class="text500">방해금지 시간설정</dt>
						<dd>
							<label><input type="checkbox" id="doNotDisturb" name="doNotDisturb" onclick="goDoNotDisturb()" class="switch"><div><em></em></div></label>
						</dd>
					</dl>
				</div>
				
				<div class="app-information3 mb20">
					<dl>
						<dt>시작 시간</dt>
						<dd>오전 01:30</dd>
					</dl>
					<dl>
						<dt>종료 시간</dt>
						<dd>오후 03:30</dd>
					</dl>
				</div>
				

			</div>

		</div>
		<!-- // app-container -->
	</div>
	
	<!--방해금지 시간설정  -->
	<div class="app-popup-wrap app-floating-type" id="do_not_disturb" style="z-index:10001; display: none;">
		<div class="app-bg-popup" style="height:100%" onclick="closeDoNotDisturb();"></div>
		<div class="app-popup-box">
			<div class="app-popup-cont">
				<div class="app-popup">
					
					<div class="app-popup-head">
						<h3 class="app-h3-popup">시작 시간</h3>
						<!--<button class="app-btn-close" onclick="javascript:popupClose('ModalSearch');"><span class="hidden">닫기</span></button>-->
					</div>
					<div class="app-popup-body ">
						
						<div class="app-timepicker">
							<div class="left">
								<div><label><input type="radio" class="radio-time" name="ra1" checked=""><div>오전</div></label></div>
								<div><label><input type="radio" class="radio-time" name="ra1"><div>오후</div></label></div>
							</div>
							<div class="right">
								<div><label><input type="radio" class="radio-time" name="ra2" checked=""><div><span>01</span><em>:</em><span>00</span></div></label></div>
								<div><label><input type="radio" class="radio-time" name="ra2"><div><span>02</span><em>:</em><span>00</span></div></label></div>
								<div><label><input type="radio" class="radio-time" name="ra2"><div><span>03</span><em>:</em><span>00</span></div></label></div>
								<div><label><input type="radio" class="radio-time" name="ra2"><div><span>04</span><em>:</em><span>00</span></div></label></div>
								<div><label><input type="radio" class="radio-time" name="ra2"><div><span>05</span><em>:</em><span>00</span></div></label></div>
								<div><label><input type="radio" class="radio-time" name="ra2"><div><span>06</span><em>:</em><span>00</span></div></label></div>
								<div><label><input type="radio" class="radio-time" name="ra2"><div><span>07</span><em>:</em><span>00</span></div></label></div>
								<div><label><input type="radio" class="radio-time" name="ra2"><div><span>08</span><em>:</em><span>00</span></div></label></div>
								<div><label><input type="radio" class="radio-time" name="ra2"><div><span>09</span><em>:</em><span>00</span></div></label></div>
								<div><label><input type="radio" class="radio-time" name="ra2"><div><span>10</span><em>:</em><span>00</span></div></label></div>
								<div><label><input type="radio" class="radio-time" name="ra2"><div><span>11</span><em>:</em><span>00</span></div></label></div>
								<div><label><input type="radio" class="radio-time" name="ra2"><div><span>12</span><em>:</em><span>00</span></div></label></div>
							</div>
						</div>
						
						
					</div>
					<div class="app-popup-foot ">
						<div class="fixed-bottom app">
							<div class="common-btns">
								<button class="btn btn-fill-gray app" onclick="closeDoNotDisturb();">취소</button>
								<button class="btn btn-fill-black app">선택</button>
							</div>
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>	
	
	<!--IPIN 설정  -->
	
	<div class="app-popup-wrap app-floating-type" id="app-container-ipin" style="z-index:10000;display:none;background:#ffffff;">
		<div>
			<div class="app-m-header hide">
				<div class="fixed">
					<h1><a href="#"><i class="ico-head-arr left"></i> <span>앱 계정가입</span> </a></h1>
				</div>
			</div>		
			<div class="inner">
				<div class="app-register">	
					<h2 class="app-join-h2">간편 비밀번호</h2>
					<div class="app-join-txt1 app-mb40">이용하실 PIN 번호를 등록해주세요.</div>
					
					<div class="app-password" id="divAppIpinNumber">
						<p></p>
						<p></p>
						<p></p>
						<p></p>
						<p></p>
						<p></p>
					</div>
					
					<div class="app-number-btns" style="padding-bottom:80px;">
						<ul>
							<li><button type="button" onclick="keyDownAppIpin(1)">1</button></li>
							<li><button type="button" onclick="keyDownAppIpin(2)">2</button></li>
							<li><button type="button" onclick="keyDownAppIpin(3)">3</button></li>
							<li><button type="button" onclick="keyDownAppIpin(4)">4</button></li>
							<li><button type="button" onclick="keyDownAppIpin(5)">5</button></li>
							<li><button type="button" onclick="keyDownAppIpin(6)">6</button></li>
							<li><button type="button" onclick="keyDownAppIpin(7)">7</button></li>
							<li><button type="button" onclick="keyDownAppIpin(8)">8</button></li>
							<li><button type="button" onclick="keyDownAppIpin(9)">9</button></li>
							<li></li>
							<li><button type="button" onclick="keyDownAppIpin(0)">0</button></li>
							<li><button type="button" onclick="keyDownAppIpin(-1)">지움</button></li>
					
						</ul>
					</div>
				</div>
				<!-- // app-register -->
				<div class="fixed-bottom app">
					<div class="common-btns">
						<button type="button" onclick="closeAppIpinSet();" class="btn btn-fill-gray app">취소</button>
						<button type="button" class="btn btn-fill-black app">완료</button>
					</div>
				</div>			
				
			</div>
		</div>
	</div>
	<!-- // app-container -->
	
	<!-- 생체인식 -->

	<div class="app-popup-wrap app-floating-type" id="app_iometrics" style="z-index:10001;display:none;">
		<div class="app-bg-popup" style="height:100%" onclick="closeAppBiometrics();"></div>
		<div class="app-popup-box">
			<div class="app-popup-cont">
				<div class="app-popup" style="max-width:700px">
					<!--
					<div class="app-popup-head">
						<h3 class="app-h3-popup">대관이용 유의사항 및 운영조례</h3>
						<button class="app-btn-close" onclick="javascript:popupClose('Modal1');"><span class="hidden">닫기</span></button>
					</div>
					-->
					<div class="app-popup-body ">
						<div class="app-finger">
							<h4>지문인증</h4>
							<div>지문 사용을 위해<br>홈 버튼에 손가락을 올려주세요</div>
							<i class="app-ico-finger"></i>
							<div>지문을 입력해주세요.</div>
						</div>
					</div>
					<div class="app-popup-foot mt40">
						<div class="fixed-bottom app">
							<div class="common-btns">
								<button class="btn btn-fill-black app"  onclick="closeAppBiometrics();">취소</button>
							</div>
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>	
	
	<script>
		var GL_BIOMETRICES = [];
	
		function goDoNotDisturb(){
			if($('#doNotDisturb').prop('checked') == true){
				popupOpen('do_not_disturb');
			}
		}
		function closeDoNotDisturb(){
			console.log('closeDoNotDisturb');
			$('#doNotDisturb').prop('checked', false);
			popupClose('do_not_disturb');
		}
		
		function goAppIpinSet(){
			if($('#appIpinSet').prop('checked') == true){
				GL_BIOMETRICES = [];
				popupOpen('app-container-ipin');
				drawIpinNumber();
			}
		}
		function closeAppIpinSet(){
			$('#appIpinSet').prop('checked', false);
			popupClose('app-container-ipin');
		}
		
		
		function goAppBiometrics(){
			if($('#appBiometrics').prop('checked') == true){
				popupOpen('app_iometrics');
			}
		}
		function closeAppBiometrics(){
			$('#appBiometrics').prop('checked', false);
			popupClose('app_iometrics');			
		}
		
		function keyDownAppIpin(data){
			console.log('keyDownAppIpin');
			if(GL_BIOMETRICES.length<6){
				if(data == -1){
					if(GL_BIOMETRICES.length>0){
						GL_BIOMETRICES.splice(GL_BIOMETRICES.length-1, 1);
					}
				}
				else{
					GL_BIOMETRICES.push(data);
				}
			}
			else{
				if(data == -1){
					if(GL_BIOMETRICES.length>0){
						GL_BIOMETRICES.splice(GL_BIOMETRICES.length-1, 1);
					}
				}
			}
			drawIpinNumber();
		}
		
		function drawIpinNumber(){
			var drawHtml = '';
			for(var i=0; i<6; i++){
				if(i < GL_BIOMETRICES.length){
					drawHtml += '<p class="active"></p>';
				}
				else{
					drawHtml += '<p></p>';
				}
			}
			$('#divAppIpinNumber').html(drawHtml);
		}
	</script>
	
</body>
</html>