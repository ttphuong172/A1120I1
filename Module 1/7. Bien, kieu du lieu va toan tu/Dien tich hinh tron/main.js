function calArea() {
    var radius = document.getElementById('radius').value;
    area = Math.PI * Math.pow(parseFloat(radius),2);
    document.getElementById('perimeter').innerHTML = area;
}