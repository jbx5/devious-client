import java.security.SecureRandom;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("bb")
@Implements("SecureRandomFuture")
public class SecureRandomFuture {
   @ObfuscatedName("bp")
   @ObfuscatedSignature(
      descriptor = "Lqi;"
   )
   @Export("loginType")
   static LoginType loginType;
   @ObfuscatedName("h")
   @Export("executor")
   ExecutorService executor = Executors.newSingleThreadExecutor();
   @ObfuscatedName("e")
   @Export("future")
   Future future;

   SecureRandomFuture() {
      this.future = this.executor.submit(new SecureRandomCallable());
   }

   @ObfuscatedName("h")
   @ObfuscatedSignature(
      descriptor = "(B)V",
      garbageValue = "120"
   )
   @Export("shutdown")
   void shutdown() {
      this.executor.shutdown();
      this.executor = null;
   }

   @ObfuscatedName("e")
   @ObfuscatedSignature(
      descriptor = "(I)Z",
      garbageValue = "-1647109690"
   )
   @Export("isDone")
   boolean isDone() {
      return this.future.isDone();
   }

   @ObfuscatedName("v")
   @ObfuscatedSignature(
      descriptor = "(I)Ljava/security/SecureRandom;",
      garbageValue = "1657619269"
   )
   @Export("get")
   SecureRandom get() {
      try {
         return (SecureRandom)this.future.get();
      } catch (Exception var4) {
         SecureRandom var3 = new SecureRandom();
         var3.nextInt();
         return var3;
      }
   }

   @ObfuscatedName("e")
   @ObfuscatedSignature(
      descriptor = "([FIFI)F",
      garbageValue = "-1005552085"
   )
   static float method2120(float[] var0, int var1, float var2) {
      float var3 = var0[var1];

      for(int var4 = var1 - 1; var4 >= 0; --var4) {
         var3 = var0[var4] + var3 * var2;
      }

      return var3;
   }

   @ObfuscatedName("v")
   @ObfuscatedSignature(
      descriptor = "(ILbm;ZI)I",
      garbageValue = "-2142160663"
   )
   static int method2119(int var0, Script var1, boolean var2) {
      if (var0 < 1000) {
         return UserComparator8.method2820(var0, var1, var2);
      } else if (var0 < 1100) {
         return WorldMapData_1.method5162(var0, var1, var2);
      } else if (var0 < 1200) {
         return NPC.method2530(var0, var1, var2);
      } else if (var0 < 1300) {
         return GrandExchangeOfferOwnWorldComparator.method1223(var0, var1, var2);
      } else if (var0 < 1400) {
         return class32.method466(var0, var1, var2);
      } else if (var0 < 1500) {
         return MusicPatchNode.method5788(var0, var1, var2);
      } else if (var0 < 1600) {
         return class71.method2033(var0, var1, var2);
      } else if (var0 < 1700) {
         return class343.method6671(var0, var1, var2);
      } else if (var0 < 1800) {
         return MusicPatchPcmStream.method5751(var0, var1, var2);
      } else if (var0 < 1900) {
         return WorldMapArea.method4967(var0, var1, var2);
      } else if (var0 < 2000) {
         return class365.method7000(var0, var1, var2);
      } else if (var0 < 2100) {
         return WorldMapData_1.method5162(var0, var1, var2);
      } else if (var0 < 2200) {
         return NPC.method2530(var0, var1, var2);
      } else if (var0 < 2300) {
         return GrandExchangeOfferOwnWorldComparator.method1223(var0, var1, var2);
      } else if (var0 < 2400) {
         return class32.method466(var0, var1, var2);
      } else if (var0 < 2500) {
         return MusicPatchNode.method5788(var0, var1, var2);
      } else if (var0 < 2600) {
         return class14.method172(var0, var1, var2);
      } else if (var0 < 2700) {
         return class7.method54(var0, var1, var2);
      } else if (var0 < 2800) {
         return MouseRecorder.method2264(var0, var1, var2);
      } else if (var0 < 2900) {
         return WorldMapSection2.method4905(var0, var1, var2);
      } else if (var0 < 3000) {
         return class365.method7000(var0, var1, var2);
      } else if (var0 < 3200) {
         return class413.method7863(var0, var1, var2);
      } else if (var0 < 3300) {
         return Client.method1742(var0, var1, var2);
      } else if (var0 < 3400) {
         return GrandExchangeOfferUnitPriceComparator.method6641(var0, var1, var2);
      } else if (var0 < 3500) {
         return SoundCache.method893(var0, var1, var2);
      } else if (var0 < 3600) {
         return FileSystem.method3479(var0, var1, var2);
      } else if (var0 < 3700) {
         return WorldMapCacheName.method5339(var0, var1, var2);
      } else if (var0 < 3800) {
         return class20.method292(var0, var1, var2);
      } else if (var0 < 3900) {
         return SceneTilePaint.method4807(var0, var1, var2);
      } else if (var0 < 4000) {
         return class358.method6920(var0, var1, var2);
      } else if (var0 < 4100) {
         return ParamComposition.method3803(var0, var1, var2);
      } else if (var0 < 4200) {
         return NPCComposition.method3725(var0, var1, var2);
      } else if (var0 < 4300) {
         return class20.method294(var0, var1, var2);
      } else if (var0 < 5100) {
         return class144.method3143(var0, var1, var2);
      } else if (var0 < 5400) {
         return class282.method5508(var0, var1, var2);
      } else if (var0 < 5600) {
         return class82.method2248(var0, var1, var2);
      } else if (var0 < 5700) {
         return WallDecoration.method4827(var0, var1, var2);
      } else if (var0 < 6300) {
         return class10.method100(var0, var1, var2);
      } else if (var0 < 6600) {
         return class141.method3107(var0, var1, var2);
      } else if (var0 < 6700) {
         return class126.method2986(var0, var1, var2);
      } else if (var0 < 6800) {
         return KeyHandler.method378(var0, var1, var2);
      } else if (var0 < 6900) {
         return Message.method1200(var0, var1, var2);
      } else if (var0 < 7000) {
         return class300.method5844(var0, var1, var2);
      } else if (var0 < 7100) {
         return class168.method3481(var0, var1, var2);
      } else if (var0 < 7200) {
         return Player.method2334(var0, var1, var2);
      } else if (var0 < 7300) {
         return class199.method4091(var0, var1, var2);
      } else if (var0 < 7500) {
         return WorldMapLabelSize.method4852(var0, var1, var2);
      } else if (var0 < 7600) {
         return class417.method7903(var0, var1, var2);
      } else {
         return var0 < 7700 ? HealthBarUpdate.method2368(var0, var1, var2) : 2;
      }
   }

   @ObfuscatedName("ie")
   @ObfuscatedSignature(
      descriptor = "(B)I",
      garbageValue = "37"
   )
   static final int method2118() {
      if (StructComposition.clientPreferences.method2412()) {
         return class383.Client_plane;
      } else {
         int var0 = SpotAnimationDefinition.getTileHeight(class145.cameraX, ClanChannel.cameraZ, class383.Client_plane);
         return var0 - class414.cameraY < 800 && (Tiles.Tiles_renderFlags[class383.Client_plane][class145.cameraX >> 7][ClanChannel.cameraZ >> 7] & 4) != 0 ? class383.Client_plane : 3;
      }
   }
}
