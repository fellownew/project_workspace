<%@ page contentType="text/html;charset=UTF-8"%>
<div>
	<table>
		<tr>
			<td colspan ="2"> ${requestScope.note.sendId } → ${requestScope.note.receiveId }    -    ${requestScope.note.sendDate }</td>
		</tr>
		<tr>
			<td>제목</td>
			<td>${requestScope.note.title }</td>
		</tr>
		<tr>
			<td>내용</td>
			<td>${requestScope.note.content }</td>
		</tr>
	</table>

</div>