function callMultiply(){
	var a = parseInt(document.myForm.text1.value);
	var b = parseInt(document.myForm.text2.value);
	var url = "multiply.jsp?a=" + a + "&b=" + b + "";
	postRequest(url);
}


function postRequest(strURL){
	var xmlHttp;
	xmlHttp = new XMLHttpRequest();
	xmlHttp.open('POST', strURL, true);
	xmlHttp.setRequestHeader('Content-Type', 'application/x-www-form-urlencoded');
	
	xmlHttp.onreadystatechange = function(){
		if (xmlHttp.readyState == 4){
			updatePage(xmlHttp.responseText);
			//alert(xmlHttp.responseText);
		}
	}
	
	xmlHttp.send(); //Send the request to server
}


function updatePage(str){
	document.getElementById('result').innerHTML = "Result="+str;
}