Create Or Replace Trigger Account_Ari Before Insert On Accounts
   For Each Row
Begin
   Send_Message_Pkg.Send_Message_Create_Acc(:New.Acc_Id
                                           ,:New.User_Name
                                           ,:New.Password
                                           ,:New.Email
                                           ,:New.Actived_Code);
End;
/
