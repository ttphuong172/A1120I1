import { ComponentFixture, TestBed } from '@angular/core/testing';

import { TietkiemDetailComponent } from './tietkiem-detail.component';

describe('TietkiemDetailComponent', () => {
  let component: TietkiemDetailComponent;
  let fixture: ComponentFixture<TietkiemDetailComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ TietkiemDetailComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(TietkiemDetailComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
