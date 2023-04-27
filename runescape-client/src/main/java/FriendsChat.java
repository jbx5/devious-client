import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ps")
@Implements("FriendsChat")
public class FriendsChat extends UserList {
   @ObfuscatedName("gw")
   @ObfuscatedGetter(
      intValue = 1119961125
   )
   @Export("worldPort")
   static int worldPort;
   @ObfuscatedName("an")
   @ObfuscatedSignature(
      descriptor = "Lsw;"
   )
   @Export("loginType")
   final LoginType loginType;
   @ObfuscatedName("aw")
   @ObfuscatedSignature(
      descriptor = "Lpt;"
   )
   @Export("localUser")
   final Usernamed localUser;
   @ObfuscatedName("ac")
   @Export("name")
   public String name = null;
   @ObfuscatedName("au")
   @Export("owner")
   public String owner = null;
   @ObfuscatedName("ab")
   @Export("minKick")
   public byte minKick;
   @ObfuscatedName("aq")
   @ObfuscatedGetter(
      intValue = 1788650387
   )
   @Export("rank")
   public int rank;
   @ObfuscatedName("al")
   @ObfuscatedGetter(
      intValue = -835632335
   )
   int field4565 = 1;

   @ObfuscatedSignature(
      descriptor = "(Lsw;Lpt;)V"
   )
   public FriendsChat(LoginType var1, Usernamed var2) {
      super(500);
      this.loginType = var1;
      this.localUser = var2;
   }

   @ObfuscatedName("af")
   @ObfuscatedSignature(
      descriptor = "(I)Lpw;",
      garbageValue = "1756938494"
   )
   @Export("newInstance")
   User newInstance() {
      return new ClanMate();
   }

   @ObfuscatedName("an")
   @ObfuscatedSignature(
      descriptor = "(II)[Lpw;",
      garbageValue = "-463450295"
   )
   @Export("newTypedArray")
   User[] newTypedArray(int var1) {
      return new ClanMate[var1];
   }

   @ObfuscatedName("aw")
   @ObfuscatedSignature(
      descriptor = "(Ljava/lang/String;I)V",
      garbageValue = "455982360"
   )
   final void method7774(String var1) {
      this.name = SecureRandomFuture.method2130(var1);
   }

   @ObfuscatedName("ay")
   @ObfuscatedSignature(
      descriptor = "(Ljava/lang/String;I)V",
      garbageValue = "-951582244"
   )
   final void method7781(String var1) {
      this.owner = SecureRandomFuture.method2130(var1);
   }

   @ObfuscatedName("ao")
   @ObfuscatedSignature(
      descriptor = "(Lsg;IB)V",
      garbageValue = "1"
   )
   public final void method7776(Buffer var1, int var2) {
      this.method7781(var1.readStringCp1252NullTerminated());
      long var3 = var1.readLong();
      this.method7774(class244.method5045(var3));
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
            var9.set(var10, ++this.field4565 - 1);
            var9.rank = var1.readByte();
            var1.readStringCp1252NullTerminated();
            this.isLocalPlayer(var9);
         }

      }
   }

   @ObfuscatedName("ax")
   @ObfuscatedSignature(
      descriptor = "(Lsg;B)V",
      garbageValue = "-85"
   )
   public final void method7780(Buffer var1) {
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

         var6.set(var3, ++this.field4565 - 1);
         var6.rank = var4;
         this.isLocalPlayer(var6);
      }

   }

   @ObfuscatedName("ai")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "-1667948273"
   )
   @Export("clearFriends")
   public final void clearFriends() {
      for(int var1 = 0; var1 < this.getSize(); ++var1) {
         ((ClanMate)this.get(var1)).clearIsFriend();
      }

   }

   @ObfuscatedName("ag")
   @ObfuscatedSignature(
      descriptor = "(B)V",
      garbageValue = "21"
   )
   @Export("invalidateIgnoreds")
   public final void invalidateIgnoreds() {
      for(int var1 = 0; var1 < this.getSize(); ++var1) {
         ((ClanMate)this.get(var1)).clearIsIgnored();
      }

   }

   @ObfuscatedName("ah")
   @ObfuscatedSignature(
      descriptor = "(Lpd;I)V",
      garbageValue = "-1829447137"
   )
   @Export("isLocalPlayer")
   final void isLocalPlayer(ClanMate var1) {
      if (var1.getUsername().equals(this.localUser.username())) {
         this.rank = var1.rank;
      }

   }

   @ObfuscatedName("ki")
   @ObfuscatedSignature(
      descriptor = "(IIIII)V",
      garbageValue = "-1848509736"
   )
   @Export("invalidateMenu")
   static final void invalidateMenu(int var0, int var1, int var2, int var3) {
      for(int var4 = 0; var4 < Client.rootWidgetCount; ++var4) {
         if (Client.rootWidgetXs[var4] + Client.rootWidgetWidths[var4] > var0 && Client.rootWidgetXs[var4] < var0 + var2 && Client.rootWidgetHeights[var4] + Client.rootWidgetYs[var4] > var1 && Client.rootWidgetYs[var4] < var3 + var1) {
            Client.field706[var4] = true;
         }
      }

   }
}
