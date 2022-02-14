import { TestBed } from '@angular/core/testing';

import { TesterMatchService } from './tester-match.service';

describe('TeseterMatchService', () => {
  let service: TesterMatchService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(TesterMatchService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
