<%@ page contentType="text/html; charset=utf-8" language="java"%>
<%@ include file="/WEB-INF/jsp/fmcs/fragments/header.jsp"%>
<%@ include file="/WEB-INF/jsp/fmcs/fragments/top.jsp"%>

<script charset="utf-8" src="<c:url value="/fmcs/js/main.js"/>"></script>

<script>
	function goTopSearch(){
		var form = document.form_search;
		
		form.submit();
	}
</script>

<div id="container">
	<div class="main">
		<div class="main-search-wrap">
			<div class="inner">
				<div class="left">
					<h2>
						<small>기장군도시관리공단 통합예약서비스</small>
						<strong>행복을 품은 도시 미래를 여는 기장</strong>
					</h2>
					<div class="main-search">
					<form id="form_search" name="form_search" method="post" action="/gijang/portal/list">
					
						<h3>통합검색 <small>기장군도시관리공단 통합예약서비스로 쉽고 빠른 예약서비스를 즐겨보세요.</small></h3>
						<div class="search">
							<input type="text" name="searchKeyword" id="searchKeyword" onkeyup="if(window.event.keyCode==13){goTopSearch()}" class="inp large ico-on" placeholder="강좌, 시설명을 검색해주세요.">
							<button type="button" class="btn btn-lg" onclick="goTopSearch()">검색하기</button>
						</div>
					</form>						
					</div>
				</div>
				<div class="right">
					<div class="main-banner pc">
						<div class="swiper-container swiper-container-horizontal">
							<div class="swiper-wrapper" style="transform: translate3d(-1600px, 0px, 0px); transition-duration: 300ms;"><div class="swiper-slide swiper-slide-duplicate swiper-slide-duplicate-active" data-swiper-slide-index="3" style="width: 400px;"><a href="#"><img src="/fmcs/img/main/tmp_banner.png" alt="배너"></a></div>
								<div class="swiper-slide swiper-slide-duplicate-next" data-swiper-slide-index="0" style="width: 400px;"><a href="#"><img src="/fmcs/img/main/tmp_banner.png" alt="배너"></a></div>
								<div class="swiper-slide" data-swiper-slide-index="1" style="width: 400px;"><a href="#"><img src="/fmcs/img/main/tmp_banner.png" alt="배너"></a></div>
								<div class="swiper-slide swiper-slide-prev" data-swiper-slide-index="2" style="width: 400px;"><a href="#"><img src="/fmcs/img/main/tmp_banner.png" alt="배너"></a></div>
								<div class="swiper-slide swiper-slide-active" data-swiper-slide-index="3" style="width: 400px;"><a href="#"><img src="/fmcs/img/main/tmp_banner.png" alt="배너"></a></div>
							<div class="swiper-slide swiper-slide-duplicate swiper-slide-next" data-swiper-slide-index="0" style="width: 400px;"><a href="#"><img src="/fmcs/img/main/tmp_banner.png" alt="배너"></a></div></div>
						<span class="swiper-notification" aria-live="assertive" aria-atomic="true"></span></div>
						<div class="controls">
							<div class="swiper-pagination swiper-pagination-fraction"><span class="swiper-pagination-current">04</span><small>/</small> <span class="swiper-pagination-total">04</span></div>
							<button class="swiper-button-prev" tabindex="0" role="button" aria-label="Previous slide"><span class="hidden">이전</span></button>
							<button class="swiper-button-next" tabindex="0" role="button" aria-label="Next slide"><span class="hidden">다음</span></button>
							<button class="btn-play"><span class="hidden">재생</span></button>
						</div>
					</div>
					<!-- // PC 메인배너 -->
				</div>
			</div>
		</div>
		<!-- // main-search-wrap -->
		
		<div class="inner">
			<div class="main-inquiry">
        		<form id="form_tab_search" name="form_tab_search" method="post">
					 <input type="hidden" id="orgNo" name="orgNo"/>
					 <input type="hidden" id="comItemCtgLvl" name="comItemCtgLvl"/>
					 <input type="hidden" id="comTopCtgCd" name="comTopCtgCd"/>
					 <input type="hidden" id="comItemCtgCd" name="comItemCtgCd"/>
					 <input type="hidden" id="ctgGubun" name="ctgGubun" value="1"/>
					 
					<div class="tabs2">
						<a href="#" onclick="changeMainTab(1)" class="active"><i class="ic1"></i><span>수강신청</span></a>
						<a href="#" onclick="changeMainTab(2)"><i class="ic2"></i><span>대관신청</span></a>
						<a href="#" onclick="changeMainTab(3)"><i class="ic3"></i><span>일일매표</span></a>
					</div>
					<div class="tab-cont">
						<div class="cont">
							<div class="inq-box">
								<select name="orgInfo01" id="orgInfo01" onchange="chagneOrgInfo(this)" class="select large">
									<option>시설 선택</option>
								</select>
								<select name="comItemCtgLvl0101" id="comItemCtgLvl0101" onchange="chagneOrgItemCtgFirst(this)" class="select large">
									<option>대분류 종목 선택</option>
								</select>
								<select name="comItemCtgLvl0201" id="comItemCtgLvl0201" onchange="chagneOrgItemCtgSecond(this)" class="select large">
									<option>소분류 종목 선택</option>
								</select>
								<button class="btn btn-lg" onclick="goSearch(1)">조회하기</button>
							</div>
							<div name="orgInfo" class="favorite-inq">
								<a href="#"><span>즐겨찾는 프로그램 조회하기</span></a>
							</div>
						</div>
						<div class="cont" style="display: none ">
							<div class="inq-box">
								<select name="orgInfo02" id="orgInfo02" onchange="chagneOrgInfo(this)" class="select large">
									<option>시설 선택</option>
								</select>
								<select name="comItemCtgLvl0102" id="comItemCtgLvl0102" onchange="chagneOrgItemCtgFirst(this)" class="select large">
									<option>대분류 종목 선택</option>
								</select>
								<select name="comItemCtgLvl0202" id="comItemCtgLvl0202" onchange="chagneOrgItemCtgSecond(this)" class="select large">
									<option>소분류 종목 선택</option>
								</select>
								<button class="btn btn-lg" onclick="goSearch(2)">조회하기</button>
							</div>
						</div>
						<div class="cont" style="display: none">
							<div class="inq-box">
								<select name="orgInfo03" id="orgInfo03" onchange="chagneOrgInfo(this)" class="select large">
									<option>시설 선택</option>
								</select>
								<select name="comItemCtgLvl0103" id="comItemCtgLvl0103" onchange="chagneOrgItemCtgFirst(this)" class="select large">
									<option>대분류 종목 선택</option>
								</select>
								<select name="comItemCtgLvl0203" id="comItemCtgLvl0203" onchange="chagneOrgItemCtgSecond(this)" class="select large">
									<option>소분류 종목 선택</option>
								</select>
								<button class="btn btn-lg" onclick="goSearch(3)">조회하기</button>
							</div>
						</div>
					</form>
				</div>
			</div>
			<!-- // 상담 검색 영역 -->
			<script>
				getOrgInfoList();
			</script>
			
			
			
			
			<!-- // Mobile 메인 배너 -->
			
			<div class="main-reservation">
				<h3 class="main-tit">예약 서비스</h3>
				<div class="slider">
					<div class="swiper-container swiper-container-horizontal swiper-container-autoheight">
						<div class="swiper-wrapper" style="height: 521px; transform: translate3d(-1950px, 0px, 0px); transition-duration: 0ms;"><div class="swiper-slide swiper-slide-duplicate" style="width: 305px; margin-right: 20px;" data-swiper-slide-index="4">
								<div class="item-fac">
									<div class="photo"><img src="/fmcs/img/main/tmp.png" alt="사진"><div class="status"><span class="ing">현재 이용중인 시설</span></div></div>
									<div class="info">
										<h4>기장 국민 체육센터</h4>
										<div class="tel">051-732-4770</div>
										<h5>접수중인 서비스</h5>
										<ul class="tag">
											<li><p>#수강신청</p></li>
											<li><p>#대관신청</p></li>
											<li><p>#일일매표</p></li>
										</ul>
										<h5>인기 수강 종목</h5>
										<ul class="tag">
											<li><p>#수영</p></li>
											<li><p>#헬스</p></li>
											<li><p>#테니스</p></li>
										</ul>
										<div class="btn-box"><button class="btn btn-fill-black block">시설 자세히보기</button></div>
									</div>
								</div>
							</div><div class="swiper-slide swiper-slide-duplicate" style="width: 305px; margin-right: 20px;" data-swiper-slide-index="5">
								<div class="item-fac">
									<div class="photo"><img src="/fmcs/img/main/tmp.png" alt="사진"><div class="status"><span class="ing">현재 이용중인 시설</span></div></div>
									<div class="info">
										<h4>기장 국민 체육센터</h4>
										<div class="tel">051-732-4770</div>
										<h5>접수중인 서비스</h5>
										<ul class="tag">
											<li><p>#수강신청</p></li>
											<li><p>#대관신청</p></li>
											<li><p>#일일매표</p></li>
										</ul>
										<h5>인기 수강 종목</h5>
										<ul class="tag">
											<li><p>#수영</p></li>
											<li><p>#헬스</p></li>
											<li><p>#테니스</p></li>
										</ul>
										<div class="btn-box"><button class="btn btn-fill-black block">시설 자세히보기</button></div>
									</div>
								</div>
							</div><div class="swiper-slide swiper-slide-duplicate" style="width: 305px; margin-right: 20px;" data-swiper-slide-index="6">
								<div class="item-fac">
									<div class="photo"><img src="/fmcs/img/main/tmp.png" alt="사진"><div class="status"><span class="ing">현재 이용중인 시설</span></div></div>
									<div class="info">
										<h4>기장 국민 체육센터</h4>
										<div class="tel">051-732-4770</div>
										<h5>접수중인 서비스</h5>
										<ul class="tag">
											<li><p>#수강신청</p></li>
											<li><p>#대관신청</p></li>
											<li><p>#일일매표</p></li>
										</ul>
										<h5>인기 수강 종목</h5>
										<ul class="tag">
											<li><p>#수영</p></li>
											<li><p>#헬스</p></li>
											<li><p>#테니스</p></li>
										</ul>
										<div class="btn-box"><button class="btn btn-fill-black block">시설 자세히보기</button></div>
									</div>
								</div>
							</div><div class="swiper-slide swiper-slide-duplicate" style="width: 305px; margin-right: 20px;" data-swiper-slide-index="7">
								<div class="item-fac">
									<div class="photo"><img src="/fmcs/img/main/tmp.png" alt="사진"><div class="status"><span class="ing">현재 이용중인 시설</span></div></div>
									<div class="info">
										<h4>기장 국민 체육센터</h4>
										<div class="tel">051-732-4770</div>
										<h5>접수중인 서비스</h5>
										<ul class="tag">
											<li><p>#수강신청</p></li>
											<li><p>#대관신청</p></li>
											<li><p>#일일매표</p></li>
										</ul>
										<h5>인기 수강 종목</h5>
										<ul class="tag">
											<li><p>#수영</p></li>
											<li><p>#헬스</p></li>
											<li><p>#테니스</p></li>
										</ul>
										<div class="btn-box"><button class="btn btn-fill-black block">시설 자세히보기</button></div>
									</div>
								</div>
							</div>
							<div class="swiper-slide" style="width: 305px; margin-right: 20px;" data-swiper-slide-index="0">
								<div class="item-fac">
									<div class="photo"><img src="/fmcs/img/main/tmp.png" alt="사진"><div class="status"><span class="ing">현재 이용중인 시설</span></div></div>
									<div class="info">
										<h4>기장 국민 체육센터</h4>
										<div class="tel">051-732-4770</div>
										<h5>접수중인 서비스</h5>
										<ul class="tag">
											<li><p>#수강신청</p></li>
											<li><p>#대관신청</p></li>
											<li><p>#일일매표</p></li>
										</ul>
										<h5>인기 수강 종목</h5>
										<ul class="tag">
											<li><p>#수영</p></li>
											<li><p>#헬스</p></li>
											<li><p>#테니스</p></li>
										</ul>
										<div class="btn-box"><button class="btn btn-fill-black block">시설 자세히보기</button></div>
									</div>
								</div>
							</div>
							<div class="swiper-slide swiper-slide-prev" style="width: 305px; margin-right: 20px;" data-swiper-slide-index="1">
								<div class="item-fac">
									<div class="photo"><img src="/fmcs/img/main/tmp.png" alt="사진"><div class="status"><span class="before">이전 이용했던 시설</span></div></div>
									<div class="info">
										<h4>기장 국민 체육센터</h4>
										<div class="tel">051-732-4770</div>
										<h5>접수중인 서비스</h5>
										<ul class="tag">
											<li><p>#수강신청</p></li>
											<li><p>#대관신청</p></li>
											<li><p>#일일매표</p></li>
										</ul>
										<h5>인기 수강 종목</h5>
										<ul class="tag">
											<li><p>#수영</p></li>
											<li><p>#헬스</p></li>
											<li><p>#테니스</p></li>
										</ul>
										<div class="btn-box"><button class="btn btn-fill-black block">시설 자세히보기</button></div>
									</div>
								</div>
							</div>
							<div class="swiper-slide swiper-slide-active" style="width: 305px; margin-right: 20px;" data-swiper-slide-index="2">
								<div class="item-fac">
									<div class="photo"><img src="/fmcs/img/main/tmp.png" alt="사진"><div class="status"><span class="ing">현재 이용중인 시설</span></div></div>
									<div class="info">
										<h4>기장 국민 체육센터</h4>
										<div class="tel">051-732-4770</div>
										<h5>접수중인 서비스</h5>
										<ul class="tag">
											<li><p>#수강신청</p></li>
											<li><p>#대관신청</p></li>
											<li><p>#일일매표</p></li>
										</ul>
										<h5>인기 수강 종목</h5>
										<ul class="tag">
											<li><p>#수영</p></li>
											<li><p>#헬스</p></li>
											<li><p>#테니스</p></li>
										</ul>
										<div class="btn-box"><button class="btn btn-fill-black block">시설 자세히보기</button></div>
									</div>
								</div>
							</div>
							<div class="swiper-slide swiper-slide-next" style="width: 305px; margin-right: 20px;" data-swiper-slide-index="3">
								<div class="item-fac">
									<div class="photo"><img src="/fmcs/img/main/tmp.png" alt="사진"><div class="status"><span class="ing">현재 이용중인 시설</span></div></div>
									<div class="info">
										<h4>기장 국민 체육센터</h4>
										<div class="tel">051-732-4770</div>
										<h5>접수중인 서비스</h5>
										<ul class="tag">
											<li><p>#수강신청</p></li>
											<li><p>#대관신청</p></li>
											<li><p>#일일매표</p></li>
										</ul>
										<h5>인기 수강 종목</h5>
										<ul class="tag">
											<li><p>#수영</p></li>
											<li><p>#헬스</p></li>
											<li><p>#테니스</p></li>
										</ul>
										<div class="btn-box"><button class="btn btn-fill-black block">시설 자세히보기</button></div>
									</div>
								</div>
							</div>
							<div class="swiper-slide" style="width: 305px; margin-right: 20px;" data-swiper-slide-index="4">
								<div class="item-fac">
									<div class="photo"><img src="/fmcs/img/main/tmp.png" alt="사진"><div class="status"><span class="ing">현재 이용중인 시설</span></div></div>
									<div class="info">
										<h4>기장 국민 체육센터</h4>
										<div class="tel">051-732-4770</div>
										<h5>접수중인 서비스</h5>
										<ul class="tag">
											<li><p>#수강신청</p></li>
											<li><p>#대관신청</p></li>
											<li><p>#일일매표</p></li>
										</ul>
										<h5>인기 수강 종목</h5>
										<ul class="tag">
											<li><p>#수영</p></li>
											<li><p>#헬스</p></li>
											<li><p>#테니스</p></li>
										</ul>
										<div class="btn-box"><button class="btn btn-fill-black block">시설 자세히보기</button></div>
									</div>
								</div>
							</div>
							<div class="swiper-slide" style="width: 305px; margin-right: 20px;" data-swiper-slide-index="5">
								<div class="item-fac">
									<div class="photo"><img src="/fmcs/img/main/tmp.png" alt="사진"><div class="status"><span class="ing">현재 이용중인 시설</span></div></div>
									<div class="info">
										<h4>기장 국민 체육센터</h4>
										<div class="tel">051-732-4770</div>
										<h5>접수중인 서비스</h5>
										<ul class="tag">
											<li><p>#수강신청</p></li>
											<li><p>#대관신청</p></li>
											<li><p>#일일매표</p></li>
										</ul>
										<h5>인기 수강 종목</h5>
										<ul class="tag">
											<li><p>#수영</p></li>
											<li><p>#헬스</p></li>
											<li><p>#테니스</p></li>
										</ul>
										<div class="btn-box"><button class="btn btn-fill-black block">시설 자세히보기</button></div>
									</div>
								</div>
							</div>
							<div class="swiper-slide" style="width: 305px; margin-right: 20px;" data-swiper-slide-index="6">
								<div class="item-fac">
									<div class="photo"><img src="/fmcs/img/main/tmp.png" alt="사진"><div class="status"><span class="ing">현재 이용중인 시설</span></div></div>
									<div class="info">
										<h4>기장 국민 체육센터</h4>
										<div class="tel">051-732-4770</div>
										<h5>접수중인 서비스</h5>
										<ul class="tag">
											<li><p>#수강신청</p></li>
											<li><p>#대관신청</p></li>
											<li><p>#일일매표</p></li>
										</ul>
										<h5>인기 수강 종목</h5>
										<ul class="tag">
											<li><p>#수영</p></li>
											<li><p>#헬스</p></li>
											<li><p>#테니스</p></li>
										</ul>
										<div class="btn-box"><button class="btn btn-fill-black block">시설 자세히보기</button></div>
									</div>
								</div>
							</div>
							<div class="swiper-slide" style="width: 305px; margin-right: 20px;" data-swiper-slide-index="7">
								<div class="item-fac">
									<div class="photo"><img src="/fmcs/img/main/tmp.png" alt="사진"><div class="status"><span class="ing">현재 이용중인 시설</span></div></div>
									<div class="info">
										<h4>기장 국민 체육센터</h4>
										<div class="tel">051-732-4770</div>
										<h5>접수중인 서비스</h5>
										<ul class="tag">
											<li><p>#수강신청</p></li>
											<li><p>#대관신청</p></li>
											<li><p>#일일매표</p></li>
										</ul>
										<h5>인기 수강 종목</h5>
										<ul class="tag">
											<li><p>#수영</p></li>
											<li><p>#헬스</p></li>
											<li><p>#테니스</p></li>
										</ul>
										<div class="btn-box"><button class="btn btn-fill-black block">시설 자세히보기</button></div>
									</div>
								</div>
							</div>
						<div class="swiper-slide swiper-slide-duplicate" style="width: 305px; margin-right: 20px;" data-swiper-slide-index="0">
								<div class="item-fac">
									<div class="photo"><img src="/fmcs/img/main/tmp.png" alt="사진"><div class="status"><span class="ing">현재 이용중인 시설</span></div></div>
									<div class="info">
										<h4>기장 국민 체육센터</h4>
										<div class="tel">051-732-4770</div>
										<h5>접수중인 서비스</h5>
										<ul class="tag">
											<li><p>#수강신청</p></li>
											<li><p>#대관신청</p></li>
											<li><p>#일일매표</p></li>
										</ul>
										<h5>인기 수강 종목</h5>
										<ul class="tag">
											<li><p>#수영</p></li>
											<li><p>#헬스</p></li>
											<li><p>#테니스</p></li>
										</ul>
										<div class="btn-box"><button class="btn btn-fill-black block">시설 자세히보기</button></div>
									</div>
								</div>
							</div><div class="swiper-slide swiper-slide-duplicate swiper-slide-duplicate-prev" style="width: 305px; margin-right: 20px;" data-swiper-slide-index="1">
								<div class="item-fac">
									<div class="photo"><img src="/fmcs/img/main/tmp.png" alt="사진"><div class="status"><span class="before">이전 이용했던 시설</span></div></div>
									<div class="info">
										<h4>기장 국민 체육센터</h4>
										<div class="tel">051-732-4770</div>
										<h5>접수중인 서비스</h5>
										<ul class="tag">
											<li><p>#수강신청</p></li>
											<li><p>#대관신청</p></li>
											<li><p>#일일매표</p></li>
										</ul>
										<h5>인기 수강 종목</h5>
										<ul class="tag">
											<li><p>#수영</p></li>
											<li><p>#헬스</p></li>
											<li><p>#테니스</p></li>
										</ul>
										<div class="btn-box"><button class="btn btn-fill-black block">시설 자세히보기</button></div>
									</div>
								</div>
							</div><div class="swiper-slide swiper-slide-duplicate swiper-slide-duplicate-active" style="width: 305px; margin-right: 20px;" data-swiper-slide-index="2">
								<div class="item-fac">
									<div class="photo"><img src="/fmcs/img/main/tmp.png" alt="사진"><div class="status"><span class="ing">현재 이용중인 시설</span></div></div>
									<div class="info">
										<h4>기장 국민 체육센터</h4>
										<div class="tel">051-732-4770</div>
										<h5>접수중인 서비스</h5>
										<ul class="tag">
											<li><p>#수강신청</p></li>
											<li><p>#대관신청</p></li>
											<li><p>#일일매표</p></li>
										</ul>
										<h5>인기 수강 종목</h5>
										<ul class="tag">
											<li><p>#수영</p></li>
											<li><p>#헬스</p></li>
											<li><p>#테니스</p></li>
										</ul>
										<div class="btn-box"><button class="btn btn-fill-black block">시설 자세히보기</button></div>
									</div>
								</div>
							</div><div class="swiper-slide swiper-slide-duplicate swiper-slide-duplicate-next" style="width: 305px; margin-right: 20px;" data-swiper-slide-index="3">
								<div class="item-fac">
									<div class="photo"><img src="/fmcs/img/main/tmp.png" alt="사진"><div class="status"><span class="ing">현재 이용중인 시설</span></div></div>
									<div class="info">
										<h4>기장 국민 체육센터</h4>
										<div class="tel">051-732-4770</div>
										<h5>접수중인 서비스</h5>
										<ul class="tag">
											<li><p>#수강신청</p></li>
											<li><p>#대관신청</p></li>
											<li><p>#일일매표</p></li>
										</ul>
										<h5>인기 수강 종목</h5>
										<ul class="tag">
											<li><p>#수영</p></li>
											<li><p>#헬스</p></li>
											<li><p>#테니스</p></li>
										</ul>
										<div class="btn-box"><button class="btn btn-fill-black block">시설 자세히보기</button></div>
									</div>
								</div>
							</div></div>
					<span class="swiper-notification" aria-live="assertive" aria-atomic="true"></span></div>
					<div class="controls">
						<div class="swiper-pagination swiper-pagination-clickable swiper-pagination-bullets"><span class="swiper-pagination-bullet" tabindex="0" role="button" aria-label="Go to slide 1"></span><span class="swiper-pagination-bullet" tabindex="0" role="button" aria-label="Go to slide 2"></span><span class="swiper-pagination-bullet swiper-pagination-bullet-active" tabindex="0" role="button" aria-label="Go to slide 3"></span><span class="swiper-pagination-bullet" tabindex="0" role="button" aria-label="Go to slide 4"></span><span class="swiper-pagination-bullet" tabindex="0" role="button" aria-label="Go to slide 5"></span><span class="swiper-pagination-bullet" tabindex="0" role="button" aria-label="Go to slide 6"></span><span class="swiper-pagination-bullet" tabindex="0" role="button" aria-label="Go to slide 7"></span><span class="swiper-pagination-bullet" tabindex="0" role="button" aria-label="Go to slide 8"></span></div>
						<button class="btn-play"></button>
					</div>
				</div>
				<a href="#" class="btn-main-more"><span>전체 서비스 열기</span></a>
			</div>
			<!-- // 예약서비스 -->	
		</div>
		
		
		<div class="main-information">
		
      		<form id="form_notice_search" name="form_notice_search" method="post">
				 <input type="hidden" id="bbsID" name="	"/>

		
			<div class="inner">
				<h3 class="main-tit">정보마당</h3>
				<div class="tabs3">
					<div>
						<a href="#" onclick="clickMainNotice('facility')" class="active">시설 공지사항</a>
						<a href="#" onclick="clickMainNotice('satin')">공단 공지사항</a>
					</div>
				</div>

					<div class="tab-cont">
						<div class="cont">
							<div class="slider slider1">
								<div class="swiper-container pc">
									<div class="swiper-wrapper" id="divPCFacilityNotice01">

									</div>
								</div>
								<div class="swiper-container mobile">
									<div class="swiper-wrapper" id="divMobileFacilityNotice01">
										
									</div>
								</div>
								<div class="controls">
									<button class="swiper-button-prev"><span class="hidden">이전</span></button>
									<button class="swiper-button-next"><span class="hidden">다음</span></button>
									<a href="/gijang/cms/default/list?bbsID=facility" class="btn-main-more"><span>더보기</span></a>
								</div>
								
							</div>
						</div>
						<div class="cont" style="display: none">
							<div class="slider slider2">
								<div class="swiper-container pc">
									<div class="swiper-wrapper" id="divPCFacilityNotice02">
									</div>
								</div>
								<div class="swiper-container mobile">
									<div class="swiper-wrapper" id="divMobileFacilityNotice02">
									</div>
								</div>
								<div class="controls">
									<button class="swiper-button-prev"><span class="hidden">이전</span></button>
									<button class="swiper-button-next"><span class="hidden">다음</span></button>
									<a href="/gijang/cms/default/list?bbsID=satin" class="btn-main-more"><span>더보기</span></a>
								</div>
								
							</div>
						</div>
					</div>
									
				<div class="main-faq-list">
					<h3 class="tit2">자주하는 질문</h3>
					<ul id="uiMainFaq">
					</ul>						
					<a href="/gijang/cms/faq/list?bbsID=FAQ" class="btn-main-more"><span>더보기</span></a>
				</div>
				
			</div>
			</form>
		</div>
		<!-- // 정보마당 -->

		<script>
		documentData("10", "FAQ", "facility");
		documentData("10", "BLOG", "satin");
		documentData("5", "FAQ", "faq");
		</script>
		
		<div class="inner">
			<div class="main-reser-stat">
				<h3 class="main-tit">예약현황</h3>
				<ul>
					<li>
						<a href="#" class="b1">
							<h4>수강신청현황</h4>
							<p>수강신청현황을<br>바로 확인하실 수 있습니다.</p>
						</a>
					</li>
					<li>
						<a href="#" class="b2">
							<h4>일일매표신청현황</h4>
							<p>일일매표신청현황을<br>바로 확인하실 수 있습니다.</p>
						</a>
					</li>
					<li>
						<a href="#" class="b3">
							<h4>대관신청현황</h4>
							<p>대관신청현황을<br>바로 확인하실 수 있습니다.</p>
						</a>
					</li>
				</ul>
			</div>
		</div>
		
	</div>
</div>
<!-- // container -->

<script>
$(function(){
	// 탭버튼 
	$('.main-inquiry .tabs2 a').click(function(){
		$(this).addClass('active').siblings().removeClass('active');
		$('.main-inquiry .tab-cont > div').eq($(this).index()).show().siblings().hide();
		return false;
	})
	
	$('.main-information .tabs3 div a').click(function(){
		$(this).addClass('active').siblings().removeClass('active');
		$('.main-information .tab-cont > div').eq($(this).index()).show().siblings().hide();
		return false;
	})
	
	if($(window).width() > 1024){
		$('.swiper-container.mobile').remove();
		$('.main-banner.mobile').remove();
	}else{
		$('.swiper-container.pc').remove();
		$('.main-banner.pc').remove();
	}
	
	// 메인배너 스와이퍼
	var mainBanner = new Swiper('.main-banner .swiper-container', {
		pagination: {
			el: ".main-banner .swiper-pagination",
			type: "fraction",
			formatFractionCurrent: function (number) {
				return ('0' + number).slice(-2);
			},
			formatFractionTotal: function (number) {
				return ('0' + number).slice(-2);
			},
			renderFraction: function (currentClass, totalClass) {
				return '<span class="' + currentClass + '"></span>' +
					   '<small>/</small> ' +
					   '<span class="' + totalClass + '"></span>';
			}
		},
		loop: true,
		navigation: {
		  nextEl: ".main-banner .swiper-button-next",
		  prevEl: ".main-banner .swiper-button-prev",
		},
		autoplay: {
		  delay: 1000,
		  disableOnInteraction: false,
		},
	});
	$('.main-banner .btn-play').click(function(){
		
		if($(this).hasClass('active')){
			mainBanner.autoplay.start();
			$(this).removeClass('active');	
				
		}else{
			mainBanner.autoplay.stop();
			$(this).addClass('active');
		}
	})
	
	
	// 예약서비스 스와이퍼
	var reservationSwiper = new Swiper('.main-reservation .slider .swiper-container', {
		slidesPerView: "4",
		spaceBetween: 20,
		autoHeight: true,
		observer: true,
		observeParents: true,

		pagination: {
		el: '.main-reservation .swiper-pagination',
			clickable: true,
		},
		loop: true,
		navigation: {
		  nextEl: ".main-reservation .slider .swiper-button-next",
		  prevEl: ".main-reservation .slider .swiper-button-prev",
		},
		autoplay: {
		  delay: 1000,
		  disableOnInteraction: false,
		},
		breakpoints: {
		  1024: {
			slidesPerView: 'auto',
			spaceBetween: 16,
		  },
		},
	});
	
	$('.main-reservation .btn-play').click(function(){
		
		if($(this).hasClass('active')){
			reservationSwiper.autoplay.start();
			$(this).removeClass('active');	
				
		}else{
			reservationSwiper.autoplay.stop();
			$(this).addClass('active');
		}
	})
	


	// 정보마당 스와이퍼 
	var informationSwiper1 = new Swiper('.main-information .slider1 .swiper-container', {
		slidesPerView: "4",
		spaceBetween: 20,
		observer: true,
		observeParents: true,

		loop: true,
		navigation: {
		  nextEl: ".main-information .slider1 .swiper-button-next",
		  prevEl: ".main-information .slider1 .swiper-button-prev",
		},
		autoplay: {
		  delay: 9999999,
		  disableOnInteraction: false,
		},
		breakpoints: {
		  1024: {
			slidesPerView: 'auto',
			spaceBetween: 16,
		  },
		},
	});
	
	var informationSwiper2 = new Swiper('.main-information .slider2 .swiper-container', {
		slidesPerView: "4",
		spaceBetween: 20,
		observer: true,
		observeParents: true,

		loop: true,
		navigation: {
		  nextEl: ".main-information .slider2 .swiper-button-next",
		  prevEl: ".main-information .slider2 .swiper-button-prev",
		},
		autoplay: {
		  delay: 9999999,
		  disableOnInteraction: false,
		},
		breakpoints: {
		  1024: {
			slidesPerView: 'auto',
			spaceBetween: 16,
		  },
		},
	});
}); // ready
</script>
	
	
<%@ include file="/WEB-INF/jsp/fmcs/fragments/footer.jsp"%>