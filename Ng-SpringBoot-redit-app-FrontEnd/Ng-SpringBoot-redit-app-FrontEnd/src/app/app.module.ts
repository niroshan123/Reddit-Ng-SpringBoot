import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { HeaderComponent } from './header/header.component';
import { SignupComponent } from './auth/signup/signup.component';
import {ReactiveFormsModule} from "@angular/forms";
import {HTTP_INTERCEPTORS, HttpClientModule} from "@angular/common/http";
import { LoginComponent } from './auth/login/login.component';
import {NgxWebstorageModule} from "ngx-webstorage";
import {BrowserAnimationsModule} from "@angular/platform-browser/animations";
import {ToastrModule} from "ngx-toastr";
import { HomeComponent } from './home/home.component';
import {TokenInterceptor} from "./token-interceptor";
import {FontAwesomeModule} from "@fortawesome/angular-fontawesome";
import { PostTileComponent } from './shared/post-tile/post-tile.component';
import { SideBarComponent } from './shared/side-bar/side-bar.component';
import { SubredditSideBarComponent } from './shared/subreddit-side-bar/subreddit-side-bar.component';
import { VoteButtonComponent } from './shared/vote-button/vote-button.component';
import { ListSubredditsComponent } from './subreddit/list-subreddits/list-subreddits.component';
import { CreateSubredditComponent } from './subreddit/create-subreddit/create-subreddit.component';
import { ViewPostComponent } from './post/view-post/view-post.component';
import { CreatePostComponent } from './post/create-post/create-post.component';
import {EditorModule} from "@tinymce/tinymce-angular";
import {NgbModule} from "@ng-bootstrap/ng-bootstrap";
import { UserProfileComponent } from './auth/user-profile/user-profile.component';

@NgModule({
  declarations: [
    AppComponent,
    HeaderComponent,
    SignupComponent,
    LoginComponent,
    HomeComponent,
    PostTileComponent,
    SideBarComponent,
    SubredditSideBarComponent,
    VoteButtonComponent,
    ListSubredditsComponent,
    CreateSubredditComponent,
    ViewPostComponent,
    CreatePostComponent,
    UserProfileComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    ReactiveFormsModule,
    HttpClientModule,
    NgxWebstorageModule.forRoot(),
    BrowserAnimationsModule,
    ToastrModule.forRoot(),
    FontAwesomeModule,
    EditorModule,
    NgbModule


  ],
  providers: [

    { provide: HTTP_INTERCEPTORS,
      useClass: TokenInterceptor,
      multi: true}
  ],
  bootstrap: [AppComponent]
})
export class AppModule { }