<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ include file="../layout/taglib.jsp"%>

<h1>Latest news from the Java World:</h1>

	   <table class="table table-bordered table-hover table-striped">
		<thead>
			<tr>
				<th>date</th>
				<th>Link</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach items="${items}" var="item">
				<tr>
					<td>
						<c:out value="${item.publishedDate}"/>
						<br/>
						<c:out value="${item.blog.name }"/>
					</td>
					<td>
						<strong>
							<a href="<c:out value="${item.link}"/>" target="_blank">
								<c:out value="${item.title }"></c:out>
							</a>
						</strong>
						<br/>
						${item.description }
					</td>
				</tr>

			</c:forEach>
		</tbody>
	</table>