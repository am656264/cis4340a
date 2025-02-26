//Rule 16. Runtime Environment (ENV)
//Ex: ENV03-J. Do not grant dangerous combinations of permissions 
// Grant the klib library AllPermission 
grant codebase "file:${klib.home}/j2se/home/klib.jar" {
  permission java.security.AllPermission;
};
