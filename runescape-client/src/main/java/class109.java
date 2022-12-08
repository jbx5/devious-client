import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URLConnection;
import javax.net.ssl.HttpsURLConnection;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("dw")
public class class109 extends UrlRequester {
   @ObfuscatedName("tc")
   @ObfuscatedGetter(
      intValue = -1571751296
   )
   static int field1442;
   @ObfuscatedName("f")
   @ObfuscatedGetter(
      intValue = -903100173
   )
   @Export("musicTrackGroupId")
   public static int musicTrackGroupId;
   @ObfuscatedName("g")
   @ObfuscatedSignature(
      descriptor = "[Lra;"
   )
   @Export("title_muteSprite")
   static IndexedSprite[] title_muteSprite;
   @ObfuscatedName("m")
   final boolean field1447;

   public class109(boolean var1, int var2) {
      super(var2);
      this.field1447 = var1;
   }

   @ObfuscatedName("h")
   @ObfuscatedSignature(
      descriptor = "(Ldm;I)V",
      garbageValue = "756674113"
   )
   void vmethod2773(UrlRequest var1) throws IOException {
      URLConnection var2 = null;

      try {
         try {
            String var3 = var1.url.getProtocol();
            if (var3.equals("http")) {
               var2 = this.method2777(var1);
            } else {
               if (!var3.equals("https")) {
                  var1.isDone0 = true;
                  return;
               }

               var2 = this.method2775(var1);
            }

            this.method2754(var2, var1);
         } catch (IOException var7) {
         }

      } finally {
         var1.isDone0 = true;
         if (var2 != null) {
            if (var2 instanceof HttpURLConnection) {
               ((HttpURLConnection)var2).disconnect();
            } else if (var2 instanceof HttpsURLConnection) {
               ((HttpsURLConnection)var2).disconnect();
            }
         }

      }
   }

   @ObfuscatedName("c")
   @ObfuscatedSignature(
      descriptor = "(Ldm;B)Ljava/net/URLConnection;",
      garbageValue = "-106"
   )
   URLConnection method2777(UrlRequest var1) throws IOException {
      URLConnection var2 = var1.url.openConnection();
      this.method2747(var2);
      return var2;
   }

   @ObfuscatedName("p")
   @ObfuscatedSignature(
      descriptor = "(Ldm;B)Ljava/net/URLConnection;",
      garbageValue = "54"
   )
   URLConnection method2775(UrlRequest var1) throws IOException {
      HttpsURLConnection var2 = (HttpsURLConnection)var1.url.openConnection();
      if (!this.field1447) {
         if (class15.field90 == null) {
            class15.field90 = new class15();
         }

         class15 var4 = class15.field90;
         var2.setSSLSocketFactory(var4);
      }

      this.method2747(var2);
      return var2;
   }

   @ObfuscatedName("h")
   @ObfuscatedSignature(
      descriptor = "(B)Ljx;",
      garbageValue = "65"
   )
   public static PacketBufferNode method2781() {
      return PacketBufferNode.PacketBufferNode_packetBufferNodeCount == 0 ? new PacketBufferNode() : PacketBufferNode.PacketBufferNode_packetBufferNodes[--PacketBufferNode.PacketBufferNode_packetBufferNodeCount];
   }

   @ObfuscatedName("h")
   @ObfuscatedSignature(
      descriptor = "(II)Lfi;",
      garbageValue = "-388064227"
   )
   @Export("VarpDefinition_get")
   public static VarpDefinition VarpDefinition_get(int var0) {
      VarpDefinition var1 = (VarpDefinition)VarpDefinition.VarpDefinition_cached.get((long)var0);
      if (var1 != null) {
         return var1;
      } else {
         byte[] var2 = VarpDefinition.VarpDefinition_archive.takeFile(16, var0);
         var1 = new VarpDefinition();
         if (var2 != null) {
            var1.decode(new Buffer(var2));
         }

         VarpDefinition.VarpDefinition_cached.put(var1, (long)var0);
         return var1;
      }
   }

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      descriptor = "(Lbz;Lbz;IZI)I",
      garbageValue = "1199021579"
   )
   @Export("compareWorlds")
   static int compareWorlds(World var0, World var1, int var2, boolean var3) {
      if (var2 == 1) {
         int var4 = var0.population;
         int var5 = var1.population;
         if (!var3) {
            if (var4 == -1) {
               var4 = 2001;
            }

            if (var5 == -1) {
               var5 = 2001;
            }
         }

         return var4 - var5;
      } else if (var2 == 2) {
         return var0.location - var1.location;
      } else if (var2 == 3) {
         if (var0.activity.equals("-")) {
            if (var1.activity.equals("-")) {
               return 0;
            } else {
               return var3 ? -1 : 1;
            }
         } else if (var1.activity.equals("-")) {
            return var3 ? 1 : -1;
         } else {
            return var0.activity.compareTo(var1.activity);
         }
      } else if (var2 == 4) {
         return var0.method1748() ? (var1.method1748() ? 0 : 1) : (var1.method1748() ? -1 : 0);
      } else if (var2 == 5) {
         return var0.method1785() ? (var1.method1785() ? 0 : 1) : (var1.method1785() ? -1 : 0);
      } else if (var2 == 6) {
         return var0.isPvp() ? (var1.isPvp() ? 0 : 1) : (var1.isPvp() ? -1 : 0);
      } else if (var2 == 7) {
         return var0.isMembersOnly() ? (var1.isMembersOnly() ? 0 : 1) : (var1.isMembersOnly() ? -1 : 0);
      } else {
         return var0.id - var1.id;
      }
   }

   @ObfuscatedName("i")
   @ObfuscatedSignature(
      descriptor = "(Ljava/lang/String;I)Ljava/lang/String;",
      garbageValue = "-182594335"
   )
   public static String method2782(String var0) {
      StringBuilder var1 = new StringBuilder(var0.length());
      int var2 = 0;
      int var3 = -1;

      for(int var4 = 0; var4 < var0.length(); ++var4) {
         char var5 = var0.charAt(var4);
         if (var5 == '<') {
            var1.append(var0.substring(var2, var4));
            var3 = var4;
         } else if (var5 == '>' && var3 != -1) {
            String var6 = var0.substring(var3 + 1, var4);
            var3 = -1;
            if (var6.equals("lt")) {
               var1.append("<");
            } else if (var6.equals("gt")) {
               var1.append(">");
            } else if (var6.equals("br")) {
               var1.append("\n");
            }

            var2 = var4 + 1;
         }
      }

      if (var2 < var0.length()) {
         var1.append(var0.substring(var2, var0.length()));
      }

      return var1.toString();
   }
}
