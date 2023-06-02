import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@ObfuscatedName("hj")
@Implements("ParamComposition")
public class ParamComposition extends DualNode {
   @ObfuscatedName("wj")
   @ObfuscatedGetter(
      longValue = 157612481299050999L
   )
   static long field2112;
   @ObfuscatedName("at")
   @ObfuscatedSignature(
      descriptor = "Lnq;"
   )
   @Export("ParamDefinition_archive")
   public static AbstractArchive ParamDefinition_archive;
   @ObfuscatedName("an")
   @ObfuscatedSignature(
      descriptor = "Llf;"
   )
   @Export("ParamDefinition_cached")
   public static EvictingDualNodeHashTable ParamDefinition_cached = new EvictingDualNodeHashTable(64);
   @ObfuscatedName("ab")
   @ObfuscatedSignature(
      descriptor = "Ltj;"
   )
   static IndexedSprite field2110;
   @ObfuscatedName("av")
   @Export("type")
   char type;
   @ObfuscatedName("as")
   @ObfuscatedGetter(
      intValue = -235649031
   )
   @Export("defaultInt")
   public int defaultInt;
   @ObfuscatedName("ax")
   @Export("defaultStr")
   public String defaultStr;
   @ObfuscatedName("ap")
   @Export("autoDisable")
   boolean autoDisable = true;

   ParamComposition() {
   }

   @ObfuscatedName("an")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "-616035375"
   )
   @Export("postDecode")
   void postDecode() {
   }

   @ObfuscatedName("av")
   @ObfuscatedSignature(
      descriptor = "(Ltz;I)V",
      garbageValue = "406252914"
   )
   @Export("decode")
   void decode(Buffer var1) {
      while(true) {
         int var2 = var1.readUnsignedByte();
         if (var2 == 0) {
            return;
         }

         this.decodeNext(var1, var2);
      }
   }

   @ObfuscatedName("as")
   @ObfuscatedSignature(
      descriptor = "(Ltz;IB)V",
      garbageValue = "-68"
   )
   @Export("decodeNext")
   void decodeNext(Buffer var1, int var2) {
      if (var2 == 1) {
         this.type = InvDefinition.method3569(var1.readByte());
      } else if (var2 == 2) {
         this.defaultInt = var1.readInt();
      } else if (var2 == 4) {
         this.autoDisable = false;
      } else if (var2 == 5) {
         this.defaultStr = var1.readStringCp1252NullTerminated();
      }

   }

   @ObfuscatedName("ax")
   @ObfuscatedSignature(
      descriptor = "(I)Z",
      garbageValue = "1266933024"
   )
   @Export("isString")
   public boolean isString() {
      return this.type == 's';
   }

   @ObfuscatedName("ap")
   @ObfuscatedSignature(
      descriptor = "(II)V",
      garbageValue = "-410179343"
   )
   static void method3838(int var0) {
      ItemContainer var1 = (ItemContainer)ItemContainer.itemContainers.get((long)var0);
      if (var1 != null) {
         var1.remove();
      }
   }

   @ObfuscatedName("ae")
   @ObfuscatedSignature(
      descriptor = "(Ljava/lang/String;B)V",
      garbageValue = "-62"
   )
   static final void method3837(String var0) {
      class59.addGameMessage(30, "", var0);
   }

   @ObfuscatedName("au")
   @ObfuscatedSignature(
      descriptor = "(Lorg/json/JSONObject;Ljava/lang/String;I)[F",
      garbageValue = "703051839"
   )
   static float[] method3829(JSONObject var0, String var1) throws JSONException {
      float[] var2 = new float[4];

      try {
         JSONArray var3 = var0.getJSONArray(var1);
         var2[0] = (float)var3.optDouble(0, 0.0);
         var2[1] = (float)var3.optDouble(1, 0.0);
         var2[2] = (float)var3.optDouble(2, 1.0);
         var2[3] = (float)var3.optDouble(3, 1.0);
      } catch (JSONException var4) {
         var2[0] = 0.0F;
         var2[1] = 0.0F;
         var2[2] = 1.0F;
         var2[3] = 1.0F;
      }

      return var2;
   }
}
