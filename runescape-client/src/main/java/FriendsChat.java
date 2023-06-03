import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("qy")
@Implements("FriendsChat")
public class FriendsChat extends UserList {
   @ObfuscatedName("an")
   @ObfuscatedSignature(
      descriptor = "Lsj;"
   )
   @Export("loginType")
   final LoginType loginType;
   @ObfuscatedName("av")
   @ObfuscatedSignature(
      descriptor = "Lpf;"
   )
   @Export("localUser")
   final Usernamed localUser;
   @ObfuscatedName("as")
   @Export("name")
   public String name = null;
   @ObfuscatedName("ax")
   @Export("owner")
   public String owner = null;
   @ObfuscatedName("ap")
   @Export("minKick")
   public byte minKick;
   @ObfuscatedName("ab")
   @ObfuscatedGetter(
      intValue = -993674261
   )
   @Export("rank")
   public int rank;
   @ObfuscatedName("ak")
   @ObfuscatedGetter(
      intValue = 201437221
   )
   int field4588 = 1;

   @ObfuscatedSignature(
      descriptor = "(Lsj;Lpf;)V"
   )
   public FriendsChat(LoginType var1, Usernamed var2) {
      super(500);
      this.loginType = var1;
      this.localUser = var2;
   }

   @ObfuscatedName("at")
   @ObfuscatedSignature(
      descriptor = "(I)Lqm;",
      garbageValue = "328216456"
   )
   @Export("newInstance")
   User newInstance() {
      return new ClanMate();
   }

   @ObfuscatedName("an")
   @ObfuscatedSignature(
      descriptor = "(IB)[Lqm;",
      garbageValue = "20"
   )
   @Export("newTypedArray")
   User[] newTypedArray(int var1) {
      return new ClanMate[var1];
   }

   @ObfuscatedName("av")
   @ObfuscatedSignature(
      descriptor = "(Ljava/lang/String;B)V",
      garbageValue = "-81"
   )
   final void method7747(String var1) {
      String var3 = MusicPatchPcmStream.base37DecodeLong(class161.method3326(var1));
      if (var3 == null) {
         var3 = "";
      }

      this.name = var3;
   }

   @ObfuscatedName("ab")
   @ObfuscatedSignature(
      descriptor = "(Ljava/lang/String;I)V",
      garbageValue = "-2122581535"
   )
   final void method7748(String var1) {
      String var3 = MusicPatchPcmStream.base37DecodeLong(class161.method3326(var1));
      if (var3 == null) {
         var3 = "";
      }

      this.owner = var3;
   }

   @ObfuscatedName("ak")
   @ObfuscatedSignature(
      descriptor = "(Ltz;II)V",
      garbageValue = "972044177"
   )
   public final void method7749(Buffer var1, int var2) {
      this.method7748(var1.readStringCp1252NullTerminated());
      long var3 = var1.readLong();
      this.method7747(MusicPatchPcmStream.method5943(var3));
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

      if (var6 != var5) {
         int var7 = var5;
         this.clear();

         for(int var8 = 0; var8 < var7; ++var8) {
            ClanMate var9 = (ClanMate)this.addLastNoPreviousUsername(new Username(var1.readStringCp1252NullTerminated(), this.loginType));
            int var10 = var1.readUnsignedShort();
            var9.set(var10, ++this.field4588 - 1);
            var9.rank = var1.readByte();
            var1.readStringCp1252NullTerminated();
            this.isLocalPlayer(var9);
         }

      }
   }

   @ObfuscatedName("ae")
   @ObfuscatedSignature(
      descriptor = "(Ltz;I)V",
      garbageValue = "715027763"
   )
   public final void method7768(Buffer var1) {
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

         var6.set(var3, ++this.field4588 - 1);
         var6.rank = var4;
         this.isLocalPlayer(var6);
      }

   }

   @ObfuscatedName("af")
   @ObfuscatedSignature(
      descriptor = "(S)V",
      garbageValue = "-16530"
   )
   @Export("clearFriends")
   public final void clearFriends() {
      for(int var1 = 0; var1 < this.getSize(); ++var1) {
         ((ClanMate)this.get(var1)).clearIsFriend();
      }

   }

   @ObfuscatedName("ao")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "648814275"
   )
   @Export("invalidateIgnoreds")
   public final void invalidateIgnoreds() {
      for(int var1 = 0; var1 < this.getSize(); ++var1) {
         ((ClanMate)this.get(var1)).clearIsIgnored();
      }

   }

   @ObfuscatedName("aa")
   @ObfuscatedSignature(
      descriptor = "(Lqb;B)V",
      garbageValue = "0"
   )
   @Export("isLocalPlayer")
   final void isLocalPlayer(ClanMate var1) {
      if (var1.getUsername().equals(this.localUser.username())) {
         this.rank = var1.rank;
      }

   }
}
