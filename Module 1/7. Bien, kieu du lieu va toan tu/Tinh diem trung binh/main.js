function trungbinh() {
    var diemLy  = document.getElementById('diemly').value;
    var diemHoa  = document.getElementById('diemhoa').value;
    var diemSinh  = document.getElementById('diemsinh').value;
    trungBinh=((parseInt(diemLy)+parseInt(diemHoa)+parseInt(diemSinh))/3);
    tong=(parseInt(diemLy)+parseInt(diemHoa)+parseInt(diemSinh));

    document.getElementById('trungbinh').innerHTML=trungBinh;
    document.getElementById('tong').innerHTML=tong;

}
