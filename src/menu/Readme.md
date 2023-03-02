### SIGN UP
*********

**Scenario** - new user sign up
- GIVEN I’m an app user
- AND I see main menu in console
- WHEN I entered 1
- AND I selected ‘Sign Up’ in main menu
- THEN registration process is started
- AND I asked to enter my first name
- AND I asked to enter my last name
- AND I asked to enter my password
- AND I asked to enter my email
- AND application successfully registered me
- AND I see notification that ‘New user is created’
- AND I navigated back to main menu
- AND instead of ‘Sign In’ I see ‘Sign Out’ label

**Technical note:**
1. Each new user should have an ID.
2. The ID number should be automatically incremented for each new user (static counter field should be a part of DefaultUser class)
</br>
</br>

**Scenario** - new user sign up - unique email successful validation
- GIVEN I’m an app user
- AND I see main menu in console
- WHEN I entered 1
- AND I selected ‘Sign Up’ in main menu
- THEN registration process is started
- AND I asked to enter my first name
- AND I asked to enter my last name
- AND I asked to enter my password
- AND I asked to enter my email
- AND I enter unique email
- AND application successfully registered me
- AND I see notification that ‘new user is created’
- AND I navigated back to main menu
- AND instead of ‘Sign In’ I see ‘Sign Out’ label
</br>
</br>

**Scenario** - new user sign up - unique email unsuccessful validation
- GIVEN I’m an app user
- AND I see main menu in console
- WHEN I entered 1
- AND I selected ‘Sign Up’ in main menu
- THEN registration process is started
- AND I asked to enter my first name
- AND I asked to enter my last name
- AND I asked to enter my password
- AND I asked to enter my email
- AND I enter NOT unique email
- AND application doesn’t register me
- AND I see notification that ‘This email is already used by another user. Please, use another email’
- AND I navigated back to main menu
</br>
</br>

**Scenario** - new user sign up - empty email unsuccessful validation
- GIVEN I’m an app user
- AND I see main menu in console
- WHEN I entered 1
- AND I selected ‘Sign Up’ in main menu
- THEN registration process is started
- AND I asked to enter my first name
- AND I asked to enter my last name
- AND I asked to enter my password
- AND I asked to enter my email
- AND I enter empty email
- AND application doesn’t register me
- AND I see notification that ‘You have to input email to register. Please, try one more time’
- AND I navigated back to main menu


### SIGN IN
****

**Scenario** - successful sign in
- GIVEN I’m an app user
- AND I have registered account
- WHEN I entered 2
- AND I selected ‘Sign In’ in main menu
- THEN Login process is started
- AND I asked to enter my email
- AND I asked to enter my password
- AND credentials are valid
- AND I see welcome message ‘Glad to see you back <First Name> <Last Name>’
- AND I see main menu
- AND instead of ‘Sign In’ I see ‘Sign Out’ label
</br>
</br>

**Scenario** - unsuccessful sign in
- GIVEN I’m an app user
- AND I have registered account
- WHEN I entered 2
- AND I selected ‘Sign In’ in main menu
- THEN Login process is started
- AND I asked to enter my email
- AND I asked to enter my password
- AND credentials are not valid
- AND I see error message ‘Unfortunately, such login and password doesn’t exist’
- AND I see main menu
</br>

**Technical notes:**
‘not valid’ credentials mean that user either not exist or password is wrong

### SIGN OUT
****

**Scenario** - successful sign out
- GIVEN I’m an app user
- AND I’m logged in
- AND I navigated to the main menu
- WHEN I entered 2
- AND I selected ‘Sign Out’ in main menu
- THEN I see sign out message ‘Have a nice day! Look forward to welcoming back!’
- AND I see main menu
- AND instead of ‘Sign Out’ I see ‘Sign In’ label
