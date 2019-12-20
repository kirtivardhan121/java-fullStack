import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { LibrarianregisterComponent } from './librarianregister.component';

describe('LibrarianregisterComponent', () => {
  let component: LibrarianregisterComponent;
  let fixture: ComponentFixture<LibrarianregisterComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ LibrarianregisterComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(LibrarianregisterComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
