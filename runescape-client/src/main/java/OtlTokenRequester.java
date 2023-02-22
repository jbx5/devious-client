import java.net.URL;
import java.util.Map;
import java.util.concurrent.Future;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;

@Implements("OtlTokenRequester")
@ObfuscatedName("com/jagex/oldscape/pub/OtlTokenRequester")
public interface OtlTokenRequester {
   Future request(String var1, URL var2, Map var3, String var4);
}
