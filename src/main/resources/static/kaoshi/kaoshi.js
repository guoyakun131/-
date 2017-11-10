//$(document).ready(function(){
//  $("button").click(function(){
//    $("p").slideToggle();
//    $.ajax
//  });
//});
$(function(){
	$("button").click(function(){
		$("p").remove();
	    kaishikaoshi();
	    $('#button').text("下一题");
 });
	
});


function kaishikaoshi(){
	
	$.ajax({
	type:"get",
	url:"/kaoshi",
	dataType:"json",
	success:function(data) {
		if(data != null){
			$('#kaoshi').append("<p>题目:<samp>"+data.ktTiMu+"</samp>"+data.ktType+"</p>"+
					"<p>A:<samp>"+data.a+"</samp></p>"+
					"<p>B:<samp>"+data.b+"</samp></p>"+
					"<p>C:<samp>"+data.c+"</samp></p>"+
					"<p>D:<samp>"+data.d+"</samp></p>"
					
			
			);
			
		}
	}
});
}