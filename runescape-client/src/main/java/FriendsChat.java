import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("nc")
@Implements("FriendsChat")
public class FriendsChat extends UserList {
   @ObfuscatedName("f")
   @ObfuscatedSignature(
      descriptor = "Lqu;"
   )
   @Export("loginType")
   final LoginType loginType;
   @ObfuscatedName("c")
   @ObfuscatedSignature(
      descriptor = "Lnk;"
   )
   @Export("localUser")
   final Usernamed localUser;
   @ObfuscatedName("x")
   @Export("name")
   public String name = null;
   @ObfuscatedName("h")
   @Export("owner")
   public String owner = null;
   @ObfuscatedName("j")
   @Export("minKick")
   public byte minKick;
   @ObfuscatedName("y")
   @ObfuscatedGetter(
      intValue = 940863549
   )
   @Export("rank")
   public int rank;
   @ObfuscatedName("d")
   @ObfuscatedGetter(
      intValue = -493682305
   )
   int field4470 = 1;

   @ObfuscatedSignature(
      descriptor = "(Lqu;Lnk;)V"
   )
   public FriendsChat(LoginType var1, Usernamed var2) {
      super(500);
      this.loginType = var1;
      this.localUser = var2;
   }

   @ObfuscatedName("a")
   @ObfuscatedSignature(
      descriptor = "(B)Loj;",
      garbageValue = "31"
   )
   @Export("newInstance")
   User newInstance() {
      return new ClanMate();
   }

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      descriptor = "(II)[Loj;",
      garbageValue = "-41299588"
   )
   @Export("newTypedArray")
   User[] newTypedArray(int var1) {
      return new ClanMate[var1];
   }

   @ObfuscatedName("c")
   @ObfuscatedSignature(
      descriptor = "(Ljava/lang/String;I)V",
      garbageValue = "634256390"
   )
   final void method7274(String var1) {
      long var5 = 0L;
      int var7 = var1.length();

      for(int var8 = 0; var8 < var7; ++var8) {
         var5 *= 37L;
         char var9 = var1.charAt(var8);
         if (var9 >= 'A' && var9 <= 'Z') {
            var5 += (long)(var9 + 1 - 65);
         } else if (var9 >= 'a' && var9 <= 'z') {
            var5 += (long)(var9 + 1 - 97);
         } else if (var9 >= '0' && var9 <= '9') {
            var5 += (long)(var9 + 27 - 48);
         }

         if (var5 >= 177917621779460413L) {
            break;
         }
      }

      while(var5 % 37L == 0L && var5 != 0L) {
         var5 /= 37L;
      }

      String var10 = WorldMapEvent.base37DecodeLong(var5);
      if (var10 == null) {
         var10 = "";
      }

      this.name = var10;
   }

   @ObfuscatedName("n")
   @ObfuscatedSignature(
      descriptor = "(Ljava/lang/String;B)V",
      garbageValue = "-64"
   )
   final void method7266(String var1) {
      long var5 = 0L;
      int var7 = var1.length();

      for(int var8 = 0; var8 < var7; ++var8) {
         var5 *= 37L;
         char var9 = var1.charAt(var8);
         if (var9 >= 'A' && var9 <= 'Z') {
            var5 += (long)(var9 + 1 - 65);
         } else if (var9 >= 'a' && var9 <= 'z') {
            var5 += (long)(var9 + 1 - 97);
         } else if (var9 >= '0' && var9 <= '9') {
            var5 += (long)(var9 + 27 - 48);
         }

         if (var5 >= 177917621779460413L) {
            break;
         }
      }

      while(0L == var5 % 37L && 0L != var5) {
         var5 /= 37L;
      }

      String var10 = WorldMapEvent.base37DecodeLong(var5);
      if (var10 == null) {
         var10 = "";
      }

      this.owner = var10;
   }

   @ObfuscatedName("r")
   @ObfuscatedSignature(
      descriptor = "(Lqr;IB)V",
      garbageValue = "15"
   )
   public final void method7267(Buffer var1, int var2) {
      this.method7266(var1.readStringCp1252NullTerminated());
      long var3 = var1.readLong();
      long var6 = var3;
      String var5;
      int var8;
      if (var3 > 0L && var3 < 6582952005840035281L) {
         if (var3 % 37L == 0L) {
            var5 = null;
         } else {
            var8 = 0;

            for(long var9 = var3; var9 != 0L; var9 /= 37L) {
               ++var8;
            }

            StringBuilder var11 = new StringBuilder(var8);

            while(0L != var6) {
               long var12 = var6;
               var6 /= 37L;
               var11.append(class359.base37Table[(int)(var12 - 37L * var6)]);
            }

            var5 = var11.reverse().toString();
         }
      } else {
         var5 = null;
      }

      this.method7274(var5);
      this.minKick = var1.readByte();
      short var14;
      if (var2 == 1) {
         var8 = var1.readUnsignedByte();
         var14 = 255;
      } else {
         if (var2 != 2) {
            throw new IllegalArgumentException("Invalid friend chat full update version: " + var2);
         }

         var8 = var1.readShortSmartSub();
         var14 = -1;
      }

      if (var14 != var8) {
         int var10 = var8;
         this.clear();

         for(int var15 = 0; var15 < var10; ++var15) {
            ClanMate var16 = (ClanMate)this.addLastNoPreviousUsername(new Username(var1.readStringCp1252NullTerminated(), this.loginType));
            int var13 = var1.readUnsignedShort();
            var16.set(var13, ++this.field4470 - 1);
            var16.rank = var1.readByte();
            var1.readStringCp1252NullTerminated();
            this.isLocalPlayer(var16);
         }

      }
   }

   @ObfuscatedName("l")
   @ObfuscatedSignature(
      descriptor = "(Lqr;B)V",
      garbageValue = "54"
   )
   public final void method7268(Buffer var1) {
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

         var6.set(var3, ++this.field4470 - 1);
         var6.rank = var4;
         this.isLocalPlayer(var6);
      }

   }

   @ObfuscatedName("s")
   @ObfuscatedSignature(
      descriptor = "(S)V",
      garbageValue = "13645"
   )
   @Export("clearFriends")
   public final void clearFriends() {
      for(int var1 = 0; var1 < this.getSize(); ++var1) {
         ((ClanMate)this.get(var1)).clearIsFriend();
      }

   }

   @ObfuscatedName("p")
   @ObfuscatedSignature(
      descriptor = "(B)V",
      garbageValue = "19"
   )
   @Export("invalidateIgnoreds")
   public final void invalidateIgnoreds() {
      for(int var1 = 0; var1 < this.getSize(); ++var1) {
         ((ClanMate)this.get(var1)).clearIsIgnored();
      }

   }

   @ObfuscatedName("b")
   @ObfuscatedSignature(
      descriptor = "(Lni;I)V",
      garbageValue = "-1978967700"
   )
   @Export("isLocalPlayer")
   final void isLocalPlayer(ClanMate var1) {
      if (var1.getUsername().equals(this.localUser.username())) {
         this.rank = var1.rank;
      }

   }

   @ObfuscatedName("p")
   @ObfuscatedSignature(
      descriptor = "(ZI)V",
      garbageValue = "1930723667"
   )
   @Export("Login_promptCredentials")
   static void Login_promptCredentials(boolean var0) {
      if (!ClanChannelMember.client.method1184() && !ClanChannelMember.client.method1366()) {
         Login.Login_response1 = "";
         Login.Login_response2 = "Enter your username/email & password.";
         Login.Login_response3 = "";
         GrandExchangeOfferOwnWorldComparator.method1171(2);
         if (var0) {
            Login.Login_password = "";
         }

         PcmPlayer.method830();
         class283.method5450();
      } else {
         GrandExchangeOfferOwnWorldComparator.method1171(10);
      }
   }
}
