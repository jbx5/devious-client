package net.unethicalite.client.devtools.widgetinspector;

import lombok.AccessLevel;
import lombok.Getter;
import net.runelite.api.widgets.Widget;
import org.slf4j.helpers.MessageFormatter;

import java.util.function.BiConsumer;
import java.util.function.Function;

public class WidgetField<T>
{
	@Getter(AccessLevel.PACKAGE)
	private final String name;

	private final Function<Widget, T> getter;

	private final BiConsumer<Widget, T> setter;

	private final Class<T> type;

	WidgetField(String name, Function<Widget, T> getter)
	{
		this(name, getter, null, null);
	}

	WidgetField(String name, Function<Widget, T> getter, BiConsumer<Widget, T> setter, Class<T> type)
	{
		this.name = name;
		this.getter = getter;
		this.setter = setter;
		this.type = type;
	}

	Object getValue(Widget widget)
	{
		Object value = getter.apply(widget);
		// These types are handled by the JTable automatically
		if (value instanceof Boolean || value instanceof Number || value instanceof String)
		{
			return value;
		}

		return MessageFormatter.format("{}", value).getMessage();
	}

	@SuppressWarnings("unchecked")
	void setValue(Widget widget, Object inValue)
	{
		Object value = null;
		if ("null".equals(inValue))
		{
			value = null;
		}
		if (type.isAssignableFrom(inValue.getClass()))
		{
			value = inValue;
		}
		else if (type == Boolean.class)
		{
			value = Boolean.valueOf((String) inValue);
		}
		else if (type == Integer.class)
		{
			value = Integer.valueOf((String) inValue);
		}
		else
		{
			//            log.warn("Type {} is not supported for editing", type);
		}
		setter.accept(widget, (T) value);
	}

	boolean isSettable()
	{
		return setter != null;
	}
}
