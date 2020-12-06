function calPerimeter() {
    var radius = document.getElementById('radius').value;
    perimeter = Math.PI *parseFloat(radius)*2
    document.getElementById('perimeter').innerHTML = perimeter;
}