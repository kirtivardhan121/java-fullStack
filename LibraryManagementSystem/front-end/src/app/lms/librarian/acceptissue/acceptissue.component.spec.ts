import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { AcceptissueComponent } from './acceptissue.component';

describe('AcceptissueComponent', () => {
  let component: AcceptissueComponent;
  let fixture: ComponentFixture<AcceptissueComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ AcceptissueComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(AcceptissueComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
