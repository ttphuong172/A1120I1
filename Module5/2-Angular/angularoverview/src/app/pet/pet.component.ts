import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-pet',
  templateUrl: './pet.component.html',
  styleUrls: ['./pet.component.css']
})
export class PetComponent implements OnInit {

  public petName="puppie";
  public petImage="http://yourdost-blog-images.s3-ap-southeast-1.amazonaws.com/wp-content/uploads/2016/01/03165939/Dogs.jpg";
  constructor() { }

  ngOnInit(): void {
  }
  updateName(e:any){
    this.petName=e.target.value;
  }
  updateImage(e:any){
    this.petImage=e.target.value;
  }

}
