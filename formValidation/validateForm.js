const myForm = document.getElementsByTagName('form')[0];
const regnum = document.getElementById("regno");
const name = document.getElementById("studName");
const marks = document.querySelectorAll('input[type="number"]');
const email = document.getElementById("emailID");

function checkRegisterNumberValid(){
  if (regnum.validity.valueMissing){
		regnum.setCustomValidity("Please enter the register number");
		regnum.reportValidity();
  }
  else if (regnum.validity.patternMismatch){
		regnum.setCustomValidity("Register Number must start with 1116 and must be 12 digits");
		regnum.reportValidity();
  }
  else {
	  regnum.setCustomValidity('');
  }
}

function checkNameValid(){
  if (name.validity.valueMissing){
		name.setCustomValidity("Please enter the student name");
		name.reportValidity();
  }
  else {
	  name.setCustomValidity('');
  }
}

function checkMarksValid(mark){
	  if (mark.validity.valueMissing){
		mark.setCustomValidity("Please enter the marks");
		mark.reportValidity();
	  }
	  else if(mark.validity.rangeUnderflow){
		mark.setCustomValidity("Mark entered should not be below zero");
		mark.reportValidity();
	  }
	  else if(mark.validity.rangeOverflow){
		mark.setCustomValidity("Mark entered should not be above 100");
		mark.reportValidity();
	  }
	  else{
		  mark.setCustomValidity('');
	  }
}

function checkEmailValid(){
  if (email.validity.valueMissing){
		email.setCustomValidity("Please enter the student email ID");
		email.reportValidity();
  }
  else if (email.validity.typeMismatch){
		email.setCustomValidity("Please enter valid email ID");
		email.reportValidity();
  }
  else {
	email.setCustomValidity('');
  }
}

regnum.addEventListener('blur',function(event) {
	if(!regnum.validity.valid) {
		checkRegisterNumberValid();
	}
	else if(regnum.validity.valid){
		regnum.setCustomValidity('');
	}
});

name.addEventListener('blur',function(event) {
	if(!name.checkValidity()) {
		checkNameValid();
	}
});

email.addEventListener('blur',function(event){
	if(!email.checkValidity()){
		checkEmailValid();
	}
});

for(let i=0;i<marks.length;i++){
	marks[i].addEventListener('blur',function(event){
		if(!marks[i].checkValidity()) {
			checkMarksValid(marks[i]);
		}
	});
}

myForm.addEventListener('submit',function(event) {
	if(!myForm.checkValidity()) {
		event.preventDefault();
		event.stopPropagation();
	}
	if(!regnum.validity.valid) {
		checkRegisterNumberValid();
	}
	if(!name.validity.valid) {
		checkNameValid();
	}
	if(!email.validity.valid){
		checkEmailValid();
	}
	for(let i=0;i<marks.length;i++){
		if(!marks[i].validity.valid){
			checkMarksValid(marks[i]);
		}
	}
});

