import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("nc")
@Implements("FriendsChat")
public class FriendsChat extends UserList {
   @ObfuscatedName("e")
   @ObfuscatedSignature(
      descriptor = "Lqi;"
   )
   @Export("loginType")
   final LoginType loginType;
   @ObfuscatedName("v")
   @ObfuscatedSignature(
      descriptor = "Lnn;"
   )
   @Export("localUser")
   final Usernamed localUser;
   @ObfuscatedName("x")
   @Export("name")
   public String name = null;
   @ObfuscatedName("m")
   @Export("owner")
   public String owner = null;
   @ObfuscatedName("q")
   @Export("minKick")
   public byte minKick;
   @ObfuscatedName("f")
   @ObfuscatedGetter(
      intValue = 1090208209
   )
   @Export("rank")
   public int rank;
   @ObfuscatedName("r")
   @ObfuscatedGetter(
      intValue = 1853458419
   )
   int field4515 = 1;

   @ObfuscatedSignature(
      descriptor = "(Lqi;Lnn;)V"
   )
   public FriendsChat(LoginType var1, Usernamed var2) {
      super(500);
      this.loginType = var1;
      this.localUser = var2;
   }

   @ObfuscatedName("h")
   @ObfuscatedSignature(
      descriptor = "(B)Lov;",
      garbageValue = "47"
   )
   @Export("newInstance")
   User newInstance() {
      return new ClanMate();
   }

   @ObfuscatedName("e")
   @ObfuscatedSignature(
      descriptor = "(II)[Lov;",
      garbageValue = "1710517567"
   )
   @Export("newTypedArray")
   User[] newTypedArray(int var1) {
      return new ClanMate[var1];
   }

   @ObfuscatedName("v")
   @ObfuscatedSignature(
      descriptor = "(Ljava/lang/String;I)V",
      garbageValue = "1741537614"
   )
   final void method7434(String var1) {
      String var3 = ModeWhere.base37DecodeLong(class32.method461(var1));
      if (var3 == null) {
         var3 = "";
      }

      this.name = var3;
   }

   @ObfuscatedName("g")
   @ObfuscatedSignature(
      descriptor = "(Ljava/lang/String;B)V",
      garbageValue = "1"
   )
   final void method7435(String var1) {
      String var3 = ModeWhere.base37DecodeLong(class32.method461(var1));
      if (var3 == null) {
         var3 = "";
      }

      this.owner = var3;
   }

   @ObfuscatedName("i")
   @ObfuscatedSignature(
      descriptor = "(Lqy;II)V",
      garbageValue = "-1010256811"
   )
   public final void method7444(Buffer var1, int var2) {
      this.method7435(var1.readStringCp1252NullTerminated());
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

            while(var6 != 0L) {
               long var12 = var6;
               var6 /= 37L;
               var11.append(class362.base37Table[(int)(var12 - 37L * var6)]);
            }

            var5 = var11.reverse().toString();
         }
      } else {
         var5 = null;
      }

      this.method7434(var5);
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
            var16.set(var13, ++this.field4515 - 1);
            var16.rank = var1.readByte();
            var1.readStringCp1252NullTerminated();
            this.isLocalPlayer(var16);
         }

      }
   }

   @ObfuscatedName("o")
   @ObfuscatedSignature(
      descriptor = "(Lqy;B)V",
      garbageValue = "109"
   )
   public final void method7437(Buffer var1) {
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

         var6.set(var3, ++this.field4515 - 1);
         var6.rank = var4;
         this.isLocalPlayer(var6);
      }

   }

   @ObfuscatedName("n")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "-1056288552"
   )
   @Export("clearFriends")
   public final void clearFriends() {
      for(int var1 = 0; var1 < this.getSize(); ++var1) {
         ((ClanMate)this.get(var1)).clearIsFriend();
      }

   }

   @ObfuscatedName("k")
   @ObfuscatedSignature(
      descriptor = "(B)V",
      garbageValue = "-87"
   )
   @Export("invalidateIgnoreds")
   public final void invalidateIgnoreds() {
      for(int var1 = 0; var1 < this.getSize(); ++var1) {
         ((ClanMate)this.get(var1)).clearIsIgnored();
      }

   }

   @ObfuscatedName("a")
   @ObfuscatedSignature(
      descriptor = "(Log;I)V",
      garbageValue = "1952671001"
   )
   @Export("isLocalPlayer")
   final void isLocalPlayer(ClanMate var1) {
      if (var1.getUsername().equals(this.localUser.username())) {
         this.rank = var1.rank;
      }

   }

   @ObfuscatedName("gy")
   @ObfuscatedSignature(
      descriptor = "(Lga;IIIB)V",
      garbageValue = "-79"
   )
   static void method7459(SequenceDefinition var0, int var1, int var2, int var3) {
      if (Client.soundEffectCount < 50 && StructComposition.clientPreferences.method2506() != 0) {
         if (var0.soundEffects != null && var1 < var0.soundEffects.length) {
            int var4 = var0.soundEffects[var1];
            if (var4 != 0) {
               int var7 = var4 >> 8;
               int var8 = var4 >> 4 & 7;
               int var9 = var4 & 15;
               Client.soundEffectIds[Client.soundEffectCount] = var7;
               Client.queuedSoundEffectLoops[Client.soundEffectCount] = var8;
               Client.queuedSoundEffectDelays[Client.soundEffectCount] = 0;
               Client.soundEffects[Client.soundEffectCount] = null;
               int var10 = (var2 - 64) / 128;
               int var11 = (var3 - 64) / 128;
               Client.soundLocations[Client.soundEffectCount] = var9 + (var11 << 8) + (var10 << 16);
               ++Client.soundEffectCount;
            }

         }
      }
   }

   @ObfuscatedName("jd")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "1514396714"
   )
   @Export("addCancelMenuEntry")
   static void addCancelMenuEntry() {
      WorldMapSectionType.method5230();
      Client.menuActions[0] = "Cancel";
      Client.menuTargets[0] = "";
      Client.menuOpcodes[0] = 1006;
      Client.menuShiftClick[0] = false;
      Client.menuOptionsCount = 1;
   }
}
