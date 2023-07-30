<%@ page import="org.egovframe.rte.fdl.string.EgovStringUtil" %>
<%@ page import="com.custom.egovframework.cmm.EgovProperties" %>
<%@ page contentType="text/html; charset=utf-8" language="java"%>
<%@ taglib prefix="c"      uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt"    uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="fn"     uri="http://java.sun.com/jsp/jstl/functions" %>
<script>
	//const apiUrl = location.protocol + "//"+ location.hostname +":8090";
	const apiUrl = "<%=EgovProperties.getProperty("spring.profiles.active")%>";
</script>

