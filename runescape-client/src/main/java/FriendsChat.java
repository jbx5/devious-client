import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("on")
@Implements("FriendsChat")
public class FriendsChat extends UserList {
   @ObfuscatedName("ex")
   @ObfuscatedSignature(
      descriptor = "Llm;"
   )
   @Export("archive7")
   static Archive archive7;
   @ObfuscatedName("w")
   @ObfuscatedSignature(
      descriptor = "Lqj;"
   )
   @Export("loginType")
   final LoginType loginType;
   @ObfuscatedName("v")
   @ObfuscatedSignature(
      descriptor = "Lod;"
   )
   @Export("localUser")
   final Usernamed localUser;
   @ObfuscatedName("s")
   @Export("name")
   public String name = null;
   @ObfuscatedName("z")
   @Export("owner")
   public String owner = null;
   @ObfuscatedName("j")
   @Export("minKick")
   public byte minKick;
   @ObfuscatedName("i")
   @ObfuscatedGetter(
      intValue = -2029011203
   )
   @Export("rank")
   public int rank;
   @ObfuscatedName("n")
   @ObfuscatedGetter(
      intValue = -1510768557
   )
   int field4549 = 1;

   @ObfuscatedSignature(
      descriptor = "(Lqj;Lod;)V"
   )
   public FriendsChat(LoginType var1, Usernamed var2) {
      super(500);
      this.loginType = var1;
      this.localUser = var2;
   }

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      descriptor = "(I)Low;",
      garbageValue = "-2146736820"
   )
   @Export("newInstance")
   User newInstance() {
      return new ClanMate();
   }

   @ObfuscatedName("w")
   @ObfuscatedSignature(
      descriptor = "(II)[Low;",
      garbageValue = "1411048209"
   )
   @Export("newTypedArray")
   User[] newTypedArray(int var1) {
      return new ClanMate[var1];
   }

   @ObfuscatedName("v")
   @ObfuscatedSignature(
      descriptor = "(Ljava/lang/String;I)V",
      garbageValue = "-1846620710"
   )
   final void method7547(String var1) {
      String var3 = WorldMapSection1.base37DecodeLong(Decimator.method1122(var1));
      if (var3 == null) {
         var3 = "";
      }

      this.name = var3;
   }

   @ObfuscatedName("n")
   @ObfuscatedSignature(
      descriptor = "(Ljava/lang/String;S)V",
      garbageValue = "-11312"
   )
   final void method7571(String var1) {
      String var3 = WorldMapSection1.base37DecodeLong(Decimator.method1122(var1));
      if (var3 == null) {
         var3 = "";
      }

      this.owner = var3;
   }

   @ObfuscatedName("l")
   @ObfuscatedSignature(
      descriptor = "(Lrd;IB)V",
      garbageValue = "-45"
   )
   public final void method7554(Buffer var1, int var2) {
      this.method7571(var1.readStringCp1252NullTerminated());
      long var3 = var1.readLong();
      long var6 = var3;
      String var5;
      int var8;
      if (var3 > 0L && var3 < 6582952005840035281L) {
         if (0L == var3 % 37L) {
            var5 = null;
         } else {
            var8 = 0;

            for(long var9 = var3; 0L != var9; var9 /= 37L) {
               ++var8;
            }

            StringBuilder var11 = new StringBuilder(var8);

            while(0L != var6) {
               long var12 = var6;
               var6 /= 37L;
               var11.append(class366.base37Table[(int)(var12 - var6 * 37L)]);
            }

            var5 = var11.reverse().toString();
         }
      } else {
         var5 = null;
      }

      this.method7547(var5);
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
            var16.set(var13, ++this.field4549 - 1);
            var16.rank = var1.readByte();
            var1.readStringCp1252NullTerminated();
            this.isLocalPlayer(var16);
         }

      }
   }

   @ObfuscatedName("k")
   @ObfuscatedSignature(
      descriptor = "(Lrd;I)V",
      garbageValue = "-1851669074"
   )
   public final void method7550(Buffer var1) {
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

         var6.set(var3, ++this.field4549 - 1);
         var6.rank = var4;
         this.isLocalPlayer(var6);
      }

   }

   @ObfuscatedName("c")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "-2134376992"
   )
   @Export("clearFriends")
   public final void clearFriends() {
      for(int var1 = 0; var1 < this.getSize(); ++var1) {
         ((ClanMate)this.get(var1)).clearIsFriend();
      }

   }

   @ObfuscatedName("r")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "1757065575"
   )
   @Export("invalidateIgnoreds")
   public final void invalidateIgnoreds() {
      for(int var1 = 0; var1 < this.getSize(); ++var1) {
         ((ClanMate)this.get(var1)).clearIsIgnored();
      }

   }

   @ObfuscatedName("b")
   @ObfuscatedSignature(
      descriptor = "(Log;I)V",
      garbageValue = "1461880973"
   )
   @Export("isLocalPlayer")
   final void isLocalPlayer(ClanMate var1) {
      if (var1.getUsername().equals(this.localUser.username())) {
         this.rank = var1.rank;
      }

   }

   @ObfuscatedName("b")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "-1334053508"
   )
   static final void method7573() {
      if (!ViewportMouse.ViewportMouse_false0) {
         int var0 = Scene.Scene_cameraPitchSine;
         int var1 = Scene.Scene_cameraPitchCosine;
         int var2 = Scene.Scene_cameraYawSine;
         int var3 = Scene.Scene_cameraYawCosine;
         int var4 = 50;
         int var5 = 3500;
         int var6 = (ViewportMouse.ViewportMouse_x - Rasterizer3D.Rasterizer3D_clipMidX) * var4 / Rasterizer3D.Rasterizer3D_zoom;
         int var7 = (ViewportMouse.ViewportMouse_y - Rasterizer3D.Rasterizer3D_clipMidY) * var4 / Rasterizer3D.Rasterizer3D_zoom;
         int var8 = (ViewportMouse.ViewportMouse_x - Rasterizer3D.Rasterizer3D_clipMidX) * var5 / Rasterizer3D.Rasterizer3D_zoom;
         int var9 = (ViewportMouse.ViewportMouse_y - Rasterizer3D.Rasterizer3D_clipMidY) * var5 / Rasterizer3D.Rasterizer3D_zoom;
         int var10 = Rasterizer3D.method4354(var7, var4, var1, var0);
         var4 = Rasterizer3D.method4352(var7, var4, var1, var0);
         var7 = var10;
         var10 = Rasterizer3D.method4354(var9, var5, var1, var0);
         var5 = Rasterizer3D.method4352(var9, var5, var1, var0);
         var9 = var10;
         var10 = Rasterizer3D.method4349(var6, var4, var3, var2);
         var4 = Rasterizer3D.method4350(var6, var4, var3, var2);
         var6 = var10;
         var10 = Rasterizer3D.method4349(var8, var5, var3, var2);
         var5 = Rasterizer3D.method4350(var8, var5, var3, var2);
         class148.field1702 = (var6 + var10) / 2;
         GrandExchangeEvent.field4284 = (var7 + var9) / 2;
         ViewportMouse.field2744 = (var5 + var4) / 2;
         class419.field4661 = (var10 - var6) / 2;
         VerticalAlignment.field2071 = (var9 - var7) / 2;
         class14.field79 = (var5 - var4) / 2;
         class172.field1868 = Math.abs(class419.field4661);
         class137.field1639 = Math.abs(VerticalAlignment.field2071);
         class151.field1743 = Math.abs(class14.field79);
      }
   }

   @ObfuscatedName("mb")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "-866294822"
   )
   static void method7572() {
      PacketWriter.clientPreferences.method2502(Client.field501);
   }
}
