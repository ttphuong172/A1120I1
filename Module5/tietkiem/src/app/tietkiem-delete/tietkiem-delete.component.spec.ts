import { ComponentFixture, TestBed } from '@angular/core/testing';

import { TietkiemDeleteComponent } from './tietkiem-delete.component';

describe('TietkiemDeleteComponent', () => {
  let component: TietkiemDeleteComponent;
  let fixture: ComponentFixture<TietkiemDeleteComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ TietkiemDeleteComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(TietkiemDeleteComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
