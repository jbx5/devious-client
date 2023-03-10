import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("pa")
@Implements("FriendsChat")
public class FriendsChat extends UserList {
   @ObfuscatedName("al")
   @ObfuscatedSignature(
      descriptor = "Lrm;"
   )
   @Export("loginType")
   final LoginType loginType;
   @ObfuscatedName("ac")
   @ObfuscatedSignature(
      descriptor = "Lpd;"
   )
   @Export("localUser")
   final Usernamed localUser;
   @ObfuscatedName("ab")
   @Export("name")
   public String name = null;
   @ObfuscatedName("an")
   @Export("owner")
   public String owner = null;
   @ObfuscatedName("ao")
   @Export("minKick")
   public byte minKick;
   @ObfuscatedName("av")
   @ObfuscatedGetter(
      intValue = -1348750425
   )
   @Export("rank")
   public int rank;
   @ObfuscatedName("aq")
   @ObfuscatedGetter(
      intValue = -1707717227
   )
   int field4507 = 1;

   @ObfuscatedSignature(
      descriptor = "(Lrm;Lpd;)V"
   )
   public FriendsChat(LoginType var1, Usernamed var2) {
      super(500);
      this.loginType = var1;
      this.localUser = var2;
   }

   @ObfuscatedName("aj")
   @ObfuscatedSignature(
      descriptor = "(I)Lpb;",
      garbageValue = "1708206647"
   )
   @Export("newInstance")
   User newInstance() {
      return new ClanMate();
   }

   @ObfuscatedName("al")
   @ObfuscatedSignature(
      descriptor = "(IB)[Lpb;",
      garbageValue = "0"
   )
   @Export("newTypedArray")
   User[] newTypedArray(int var1) {
      return new ClanMate[var1];
   }

   @ObfuscatedName("ac")
   @ObfuscatedSignature(
      descriptor = "(Ljava/lang/String;I)V",
      garbageValue = "-612546541"
   )
   final void method7488(String var1) {
      this.name = class110.method2819(var1);
   }

   @ObfuscatedName("ar")
   @ObfuscatedSignature(
      descriptor = "(Ljava/lang/String;B)V",
      garbageValue = "-104"
   )
   final void method7505(String var1) {
      this.owner = class110.method2819(var1);
   }

   @ObfuscatedName("ak")
   @ObfuscatedSignature(
      descriptor = "(Lsy;II)V",
      garbageValue = "1528114624"
   )
   public final void method7479(Buffer var1, int var2) {
      this.method7505(var1.readStringCp1252NullTerminated());
      long var3 = var1.readLong();
      this.method7488(class207.method4073(var3));
      this.minKick = var1.readByte();
      int var5;
      short var6;
      if (var2 == 1) {
         var5 = var1.readUnsignedByte();
         var6 = 255;
      } else {
         if (var2 != 2) {
            throw new IllegalArgumentException("Invalid friend chat full update version: " + var2);
         }

         var5 = var1.readShortSmartSub();
         var6 = -1;
      }

      if (var5 != var6) {
         int var7 = var5;
         this.clear();

         for(int var8 = 0; var8 < var7; ++var8) {
            ClanMate var9 = (ClanMate)this.addLastNoPreviousUsername(new Username(var1.readStringCp1252NullTerminated(), this.loginType));
            int var10 = var1.readUnsignedShort();
            var9.set(var10, ++this.field4507 - 1);
            var9.rank = var1.readByte();
            var1.readStringCp1252NullTerminated();
            this.isLocalPlayer(var9);
         }

      }
   }

   @ObfuscatedName("ax")
   @ObfuscatedSignature(
      descriptor = "(Lsy;I)V",
      garbageValue = "426960419"
   )
   public final void method7480(Buffer var1) {
      Username var2 = new Username(var1.readStringCp1252NullTerminated(), this.loginType);
      int var3 = var1.readUnsignedShort();
      byte var4 = var1.readByte();
      boolean var5 = false;
      if (var4 == -128) {
         var5 = true;
      }

      ClanMate var6;
      if (var5) {
         if (this.getSize() == 0) {
            return;
         }

         var6 = (ClanMate)this.getByCurrentUsername(var2);
         if (var6 != null && var6.getWorld() == var3) {
            this.remove(var6);
         }
      } else {
         var1.readStringCp1252NullTerminated();
         var6 = (ClanMate)this.getByCurrentUsername(var2);
         if (var6 == null) {
            if (this.getSize() > super.capacity) {
               return;
            }

            var6 = (ClanMate)this.addLastNoPreviousUsername(var2);
         }

         var6.set(var3, ++this.field4507 - 1);
         var6.rank = var4;
         this.isLocalPlayer(var6);
      }

   }

   @ObfuscatedName("as")
   @ObfuscatedSignature(
      descriptor = "(B)V",
      garbageValue = "5"
   )
   @Export("clearFriends")
   public final void clearFriends() {
      for(int var1 = 0; var1 < this.getSize(); ++var1) {
         ((ClanMate)this.get(var1)).clearIsFriend();
      }

   }

   @ObfuscatedName("ay")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "274384897"
   )
   @Export("invalidateIgnoreds")
   public final void invalidateIgnoreds() {
      for(int var1 = 0; var1 < this.getSize(); ++var1) {
         ((ClanMate)this.get(var1)).clearIsIgnored();
      }

   }

   @ObfuscatedName("am")
   @ObfuscatedSignature(
      descriptor = "(Lpo;I)V",
      garbageValue = "715375008"
   )
   @Export("isLocalPlayer")
   final void isLocalPlayer(ClanMate var1) {
      if (var1.getUsername().equals(this.localUser.username())) {
         this.rank = var1.rank;
      }

   }

   @ObfuscatedName("aq")
   @ObfuscatedSignature(
      descriptor = "(ILcv;ZI)I",
      garbageValue = "643710583"
   )
   static int method7509(int var0, Script var1, boolean var2) {
      boolean var3 = true;
      Widget var4;
      if (var0 >= 2000) {
         var0 -= 1000;
         var4 = WorldMapSection1.getWidget(Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]);
         var3 = false;
      } else {
         var4 = var2 ? GameObject.scriptDotWidget : SoundSystem.scriptActiveWidget;
      }

      int var5;
      if (var0 == ScriptOpcodes.CC_SETOP) {
         var5 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] - 1;
         if (var5 >= 0 && var5 <= 9) {
            var4.setAction(var5, Interpreter.Interpreter_stringStack[--HealthBar.Interpreter_stringStackSize]);
            return 1;
         } else {
            --HealthBar.Interpreter_stringStackSize;
            return 1;
         }
      } else {
         int var6;
         if (var0 == ScriptOpcodes.CC_SETDRAGGABLE) {
            Interpreter.Interpreter_intStackSize -= 2;
            var5 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize];
            var6 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1];
            var4.parent = class36.getWidgetChild(var5, var6);
            return 1;
         } else if (var0 == ScriptOpcodes.CC_SETDRAGGABLEBEHAVIOR) {
            var4.isScrollBar = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1;
            return 1;
         } else if (var0 == ScriptOpcodes.CC_SETDRAGDEADZONE) {
            var4.dragZoneSize = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
            return 1;
         } else if (var0 == ScriptOpcodes.CC_SETDRAGDEADTIME) {
            var4.dragThreshold = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
            return 1;
         } else if (var0 == ScriptOpcodes.CC_SETOPBASE) {
            var4.dataText = Interpreter.Interpreter_stringStack[--HealthBar.Interpreter_stringStackSize];
            return 1;
         } else if (var0 == ScriptOpcodes.CC_SETTARGETVERB) {
            var4.spellActionName = Interpreter.Interpreter_stringStack[--HealthBar.Interpreter_stringStackSize];
            return 1;
         } else if (var0 == ScriptOpcodes.CC_CLEAROPS) {
            var4.actions = null;
            return 1;
         } else if (var0 == 1308) {
            var4.prioritizeMenuEntry = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1;
            return 1;
         } else if (var0 == 1309) {
            --Interpreter.Interpreter_intStackSize;
            return 1;
         } else {
            int var7;
            byte[] var8;
            if (var0 != ScriptOpcodes.CC_SETOPKEY) {
               byte var11;
               if (var0 == ScriptOpcodes.CC_SETOPTKEY) {
                  Interpreter.Interpreter_intStackSize -= 2;
                  var11 = 10;
                  var8 = new byte[]{(byte)Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]};
                  byte[] var9 = new byte[]{(byte)Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]};
                  GrandExchangeOffer.Widget_setKey(var4, var11, var8, var9);
                  return 1;
               } else if (var0 == ScriptOpcodes.CC_SETOPKEYRATE) {
                  Interpreter.Interpreter_intStackSize -= 3;
                  var5 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize] - 1;
                  var6 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1];
                  var7 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 2];
                  if (var5 >= 0 && var5 <= 9) {
                     Timer.Widget_setKeyRate(var4, var5, var6, var7);
                     return 1;
                  } else {
                     throw new RuntimeException();
                  }
               } else if (var0 == ScriptOpcodes.CC_SETOPTKEYRATE) {
                  var11 = 10;
                  var6 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
                  var7 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
                  Timer.Widget_setKeyRate(var4, var11, var6, var7);
                  return 1;
               } else if (var0 == ScriptOpcodes.CC_SETOPKEYIGNOREHELD) {
                  --Interpreter.Interpreter_intStackSize;
                  var5 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize] - 1;
                  if (var5 >= 0 && var5 <= 9) {
                     class173.Widget_setKeyIgnoreHeld(var4, var5);
                     return 1;
                  } else {
                     throw new RuntimeException();
                  }
               } else if (var0 == ScriptOpcodes.CC_SETOPTKEYIGNOREHELD) {
                  var5 = 10;
                  class173.Widget_setKeyIgnoreHeld(var4, var5);
                  return 1;
               } else {
                  return 2;
               }
            } else {
               byte[] var10 = null;
               var8 = null;
               if (var3) {
                  Interpreter.Interpreter_intStackSize -= 10;

                  for(var7 = 0; var7 < 10 && Interpreter.Interpreter_intStack[var7 + Interpreter.Interpreter_intStackSize] >= 0; var7 += 2) {
                  }

                  if (var7 > 0) {
                     var10 = new byte[var7 / 2];
                     var8 = new byte[var7 / 2];

                     for(var7 -= 2; var7 >= 0; var7 -= 2) {
                        var10[var7 / 2] = (byte)Interpreter.Interpreter_intStack[var7 + Interpreter.Interpreter_intStackSize];
                        var8[var7 / 2] = (byte)Interpreter.Interpreter_intStack[var7 + Interpreter.Interpreter_intStackSize + 1];
                     }
                  }
               } else {
                  Interpreter.Interpreter_intStackSize -= 2;
                  var10 = new byte[]{(byte)Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]};
                  var8 = new byte[]{(byte)Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]};
               }

               var7 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] - 1;
               if (var7 >= 0 && var7 <= 9) {
                  GrandExchangeOffer.Widget_setKey(var4, var7, var10, var8);
                  return 1;
               } else {
                  throw new RuntimeException();
               }
            }
         }
      }
   }
}
