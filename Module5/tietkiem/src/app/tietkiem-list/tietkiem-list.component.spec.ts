import { ComponentFixture, TestBed } from '@angular/core/testing';

import { TietkiemListComponent } from './tietkiem-list.component';

describe('TietkiemListComponent', () => {
  let component: TietkiemListComponent;
  let fixture: ComponentFixture<TietkiemListComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ TietkiemListComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(TietkiemListComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
