//Rule 16. Runtime Environment (ENV)
//Ex: ENV03-J. Do not grant dangerous combinations of permissions 
grant codeBase
    "file:${klib.home}/j2se/home/klib.jar", signedBy "Admin" {
  permission java.io.FilePermission "/tmp/*", "read";
  permission java.io.SocketPermission "*", "connect";
};
