Create Or Replace Package Send_Message_Pkg Is

   -- Gui message khi nguoi dung tao account thanh cong .
   Procedure Send_Message_Create_Acc(p_Acc_Id      Accounts.Acc_Id%Type
                                    ,p_User_Name   Accounts.User_Name%Type
                                    ,p_Password    Accounts.Password%Type
                                    ,p_Email       Accounts.Email%Type
                                    ,p_Active_Code Accounts.Actived_Code%Type);

End Send_Message_Pkg;
/
Create Or Replace Package Body Send_Message_Pkg Is

   Procedure Send_Message_Create_Acc(p_Acc_Id      Accounts.Acc_Id%Type
                                    ,p_User_Name   Accounts.User_Name%Type
                                    ,p_Password    Accounts.Password%Type
                                    ,p_Email       Accounts.Email%Type
                                    ,p_Active_Code Accounts.Actived_Code%Type) As
      v_Title        Auto_Mail_Messages.Message_Title%Type;
      v_Message      Auto_Mail_Messages.Message_Body%Type;
      v_Message_Type Auto_Mail_Messages.Message_Type%Type;
      v_Description  Auto_Mail_Messages.Description%Type;
      v_Found        Boolean := False;
      v_Amh_Id       Auto_Mail_Histories.Amh_Id%Type;
   Begin
      Begin
         Select Amm.Message_Title
               ,Amm.Message_Body
               ,Amm.Message_Type
               ,Amm.Description
         Into   v_Title
               ,v_Message
               ,v_Message_Type
               ,v_Description
         From   Auto_Mail_Messages Amm
         Where  Amm.Amm_Code = 'AMM001';
         ---
         v_Found := True;
      Exception
         When No_Data_Found Then
            v_Found := False;
      End;
      If v_Found = True Then
         -- Thay the .
         v_Message := Replace(v_Message
                             ,'[userName]'
                             ,p_User_Name);
         v_Message := Replace(v_Message
                             ,'[password]'
                             ,p_Password);
         v_Message := Replace(v_Message
                             ,'[email]'
                             ,p_Email);
         v_Message := Replace(v_Message
                             ,'[activeCode]'
                             ,p_Active_Code);
         ----                    
         Select Amh_Seq.Nextval Into v_Amh_Id From Dual;
         ---
         Insert Into Auto_Mail_Histories
            (Amh_Id
            ,Message_Type
            ,Message_Title
            ,Message_Body
            ,Description
            ,Created_By
            ,Create_Date
            ,Modified_By
            ,Modify_Date
            ,Send_State)
         Values
            (v_Amh_Id -- Amh_Id
            ,v_Message_Type -- Message_Type
            ,v_Title -- Message_Title
            ,v_Message -- Message_Body
            ,v_Description -- Description
            ,'auto' -- Created_By -- Created_By
            ,Sysdate -- Create_Date -- Create_Date
            ,Null -- Modified_By
            ,Null -- Modify_Date
            ,'N' -- Send_State
             );
      End If;
      Begin
         Demo_Mail.Mail(Sender     => Demo_Mail.Admin_Mail_Acc
                       ,Recipients => p_Email
                       ,Subject    => v_Title
                       ,Message    => v_Message);
         -- Gui mail thanh cong . 
         Update Auto_Mail_Histories Amh
         Set    Amh.Send_State = 'Y'
         Where  Amh.Amh_Id = v_Amh_Id;
      Exception
         When Others Then
            Null;
      End;
   End;

End Send_Message_Pkg;
/
