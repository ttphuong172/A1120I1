import { TestBed } from '@angular/core/testing';

import { TietkiemService } from './tietkiem.service';

describe('TietkiemService', () => {
  let service: TietkiemService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(TietkiemService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
