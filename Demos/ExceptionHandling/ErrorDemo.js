/*Type Error*/
let num = 12;
try {
  num.toUpperCase();
}
catch (e) {
  console.log(e.name)			
  console.log(e.message)		
}

/*Reference Error*/
try{
  let regno = 4001;
  let name = "Rahul";
  console.log(cgpa);
}
catch(e){
  console.log(e.name)		
  console.log(e.message)	
}

/*Range Error*/
try {
  console.log(Array(Math.pow(2,32)));
} catch (e) {
  console.log(e.message);
  console.log(e.name); 
}

/*Synatx Error*/
try {
  console.log('Vanakkam);
} catch (e) {
  console.log(e.message);
  console.log(e.name); 
}

/*URI Error*/
try {
  decodeURIComponent("%");
} catch (e) {
  console.log(e instanceof URIError); 
  console.log(e.message);
  console.log(e.name); 
}
