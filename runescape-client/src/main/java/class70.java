import java.io.InputStream;
import java.io.OutputStreamWriter;
import java.math.BigInteger;
import java.net.URL;
import java.net.URLConnection;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("by")
public class class70 {
   @ObfuscatedName("f")
   static final BigInteger field899 = new BigInteger("10001", 16);
   @ObfuscatedName("w")
   static final BigInteger field896 = new BigInteger("a7902ee1812735d843652eecfdde4912bfedd478f177374c0294648fb49bbd88547018a7ef9a722512bca091413e35645f8120d67e4497f0d3ed6be6659c7e9a26b273993523273937e636dadde2bdd032e414dbf42dc78a83b7b87f92f5a7248ba59d646a4211612168c23b8e4053b2cddf8725205b42b6ece8636e54050027", 16);

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      descriptor = "(Li;I)Ls;",
      garbageValue = "-1042973543"
   )
   public static class3 method2090(class6 var0) {
      switch (var0.field21) {
         case 0:
            return new class0();
         default:
            throw new IllegalArgumentException();
      }
   }

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      descriptor = "(I)J",
      garbageValue = "716176413"
   )
   static long method2085() {
      try {
         URL var0 = new URL(class310.method6356("services", false) + "m=accountappeal/login.ws");
         URLConnection var1 = var0.openConnection();
         var1.setRequestProperty("connection", "close");
         var1.setDoInput(true);
         var1.setDoOutput(true);
         var1.setConnectTimeout(5000);
         OutputStreamWriter var2 = new OutputStreamWriter(var1.getOutputStream());
         var2.write("data1=req");
         var2.flush();
         InputStream var3 = var1.getInputStream();
         Buffer var4 = new Buffer(new byte[1000]);

         do {
            int var5 = var3.read(var4.array, var4.offset, 1000 - var4.offset);
            if (var5 == -1) {
               var4.offset = 0;
               long var7 = var4.readLong();
               return var7;
            }

            var4.offset += var5;
         } while(var4.offset < 1000);

         return 0L;
      } catch (Exception var9) {
         return 0L;
      }
   }

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      descriptor = "(II)Lba;",
      garbageValue = "249838937"
   )
   @Export("getScript")
   static Script getScript(int var0) {
      Script var1 = (Script)Script.Script_cached.get((long)var0);
      if (var1 != null) {
         return var1;
      } else {
         byte[] var2 = class12.archive12.takeFile(var0, 0);
         if (var2 == null) {
            return null;
         } else {
            var1 = WorldMapLabelSize.newScript(var2);
            Script.Script_cached.put(var1, (long)var0);
            return var1;
         }
      }
   }

   @ObfuscatedName("w")
   @ObfuscatedSignature(
      descriptor = "(IIII)Lrs;",
      garbageValue = "1805295704"
   )
   static SpritePixels method2088(int var0, int var1, int var2) {
      return (SpritePixels)WorldMapRegion.WorldMapRegion_cachedSprites.get(ParamComposition.method3840(var0, var1, var2));
   }

   @ObfuscatedName("t")
   @ObfuscatedSignature(
      descriptor = "(II)I",
      garbageValue = "298475872"
   )
   public static int method2087(int var0) {
      class133 var2 = (class133)SequenceDefinition.SequenceDefinition_cachedModel.get((long)var0);
      class133 var1;
      if (var2 != null) {
         var1 = var2;
      } else {
         var2 = Login.method2165(SequenceDefinition.SequenceDefinition_animationsArchive, class16.SequenceDefinition_skeletonsArchive, var0, false);
         if (var2 != null) {
            SequenceDefinition.SequenceDefinition_cachedModel.put(var2, (long)var0);
         }

         var1 = var2;
      }

      if (var1 == null) {
         return 2;
      } else {
         return var1.method3094() ? 0 : 1;
      }
   }

   @ObfuscatedName("o")
   @ObfuscatedSignature(
      descriptor = "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V",
      garbageValue = "-1804034387"
   )
   @Export("setLoginResponseString")
   static void setLoginResponseString(String var0, String var1, String var2) {
      Login.Login_response1 = var0;
      Login.Login_response2 = var1;
      Login.Login_response3 = var2;
   }
}
