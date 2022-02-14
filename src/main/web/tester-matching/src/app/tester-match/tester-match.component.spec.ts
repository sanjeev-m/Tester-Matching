import { ComponentFixture, TestBed } from '@angular/core/testing';

import { TesterMatchComponent } from './tester-match.component';

describe('TesterMatchComponent', () => {
  let component: TesterMatchComponent;
  let fixture: ComponentFixture<TesterMatchComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ TesterMatchComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(TesterMatchComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
