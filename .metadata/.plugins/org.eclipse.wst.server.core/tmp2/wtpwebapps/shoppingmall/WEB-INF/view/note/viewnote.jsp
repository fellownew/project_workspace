<%@ page contentType="text/html;charset=UTF-8"%>
<div>
	<table style="width: 450px;height: 400px;text-align: center ">
		<thead>
			<tr style="height: 50px">
				<td style="width:100px;background: #FAFAFA">보내는 이</td>
				<td style="width:100px">${requestScope.note.sendId }</td>
				<td style="background: #FAFAFA">일시</td>
			</tr>
			<tr>
				<td style="background: #FAFAFA">받는 이</td>
				<td>${requestScope.note.receiveId }</td>
				<td>${requestScope.note.sendDate }</td>
			</tr>
		</thead>
		<tbody>
			<tr style="height: 50px">
				<td style="background: #FAFAFA">제목</td>
				<td colspan="2" style="text-align: left;">${requestScope.note.title }</td>
			</tr>
			<tr>
				<td style="background: #FAFAFA">내용</td>
				<td colspan="2" style="text-align: left;">${requestScope.note.content }</td>
			</tr>
		</tbody>
	</table>
</div>