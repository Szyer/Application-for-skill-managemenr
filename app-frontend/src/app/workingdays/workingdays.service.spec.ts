import { TestBed } from '@angular/core/testing';

import { WorkingdaysService } from './workingdays.service';

describe('WorkingdaysService', () => {
  let service: WorkingdaysService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(WorkingdaysService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
