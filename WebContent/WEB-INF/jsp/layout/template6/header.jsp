<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%><%@ include file="/include.inc.jsp"%>

<header id="header">

    <ul id="sm">
        <li><a href="<c:out value='/'/>"><fmt:message key="ui.home"/></a></li>
        <li><a href="<c:out value='/news'/>"><fmt:message key="ui.news"/></a></li>
        
		<c:forEach var="item" items="${info:pages('header')}">
		<li ${param.pageId eq item.id ? 'class="selected"' : ''}><a href="<c:url value='/webpage/${item.id}'/>">${item.name}</a></li>
		</c:forEach>
				
        <li><a href="<c:out value='/myaccount'/>"><fmt:message key="ui.myaccount"/></a></li>

        <c:if test="${!empty info:contextUser()}">
			<li><a href="<c:url value='/passport/logout'/>"><fmt:message key="ui.logout"/></a></li>
		</c:if>
    </ul>
    
    <div id="logo"><img class="logobg" src="/styles/website/${param.template}/themes/${param.theme}/images/sp.gif" width="250" height="60" /></div>
    <div id="areaHeader"><img class="areaHeaderImg" src="/styles/website/${param.template}/themes/${param.theme}/images/sp.gif" /></div>
    
    <div id="cart_info">
        <a href="#"><strong>0</strong> items in cart<strong>($0.00)</strong></a>
    </div>
    <div id="nav_searchBox">
    	<div class="left"></div>
        <form class="search" action="#" method="post">
            <select name="brand"><option>SELECT BRAND</option></select>
            <input name="search" type="text" class="searchInput" value="KEYWORDS &amp; ITEMS" />
            <button class="btn_search"></button>
        </form>
        <div class="right"></div>
        <a class="btn_allCat" href="<c:out value='/products'/>"></a>
    </div>
</header>

