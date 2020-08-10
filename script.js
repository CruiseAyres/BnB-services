window.onload = function() {
    fadeIn()
    setTimeout(fadeIn2, 5000)
}
  
function fadeIn() {
    document.getElementById('fadeIn').style.opacity = '1';
}

function fadeIn2() {
    document.getElementById('fadeIn2').style.opacity = '1';
}