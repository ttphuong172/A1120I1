import { ComponentFixture, TestBed } from '@angular/core/testing';

import { TietkiemCreateComponent } from './tietkiem-create.component';

describe('TietkiemCreateComponent', () => {
  let component: TietkiemCreateComponent;
  let fixture: ComponentFixture<TietkiemCreateComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ TietkiemCreateComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(TietkiemCreateComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
