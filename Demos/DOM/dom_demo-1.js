const para = document.createElement("p");
const paraText = document.createTextNode("I am a paragraph.");
para.appendChild(paraText);
document.body.appendChild(para);  
para.style.color="red";
para.style.fontSize = "100px";