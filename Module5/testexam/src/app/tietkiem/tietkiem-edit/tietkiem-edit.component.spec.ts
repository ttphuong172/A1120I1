import { ComponentFixture, TestBed } from '@angular/core/testing';

import { TietkiemEditComponent } from './tietkiem-edit.component';

describe('TietkiemEditComponent', () => {
  let component: TietkiemEditComponent;
  let fixture: ComponentFixture<TietkiemEditComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ TietkiemEditComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(TietkiemEditComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
