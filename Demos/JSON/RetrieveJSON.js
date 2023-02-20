function postRequest(strURL){
	var a = parseInt(document.myForm.text1.value);
	console.log(a);
	var url = "https://github.com/mikeleguedes/json-movie-list/blob/master/movies/1925/the-wizard-of-oz.json";
	var xmlHttp;
	xmlHttp = new XMLHttpRequest();
	xmlHttp.open('POST', url, true);
	//xmlHttp.setRequestHeader('Content-Type', 'application/x-www-form-urlencoded');
	
	xmlHttp.onreadystatechange = function(){
		if (this.readyState == 4 && this.status == 200){
			var result = JSON.parse(xmlHttp.responseText);
			document.getElementById('result').innerHTML = "Result="+result;
		}
	}
	xmlHttp.send(); //Send the request to server
}
