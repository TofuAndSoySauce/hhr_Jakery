<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="../layout/header.jsp"%>

<div class="container">
<form>
	<div class="form-group">
	<label for="title">Title</label>
	<input id="title" type="text" class="form-control" placeholder="Enter title">	
	</div>
	<div class="form-group">
	<label for="content">Content:</label>
	<textarea id="content" class="form-control summernote" rows="5"></textarea>
	</div>
</form>
<button id="btn-save" class="btn btn-primary">저장</button>
</div>
<br/>
<script>
	$('.summernote').summernote({
		tabsize: 2,
		height: 300
	});
</script>
<script type="text/javascript" src="/js/freeboard.js"></script>
</body>
</html>