package ru.mulashkin.javamm.code.fragment;

import java.util.List;
import static java.lang.String.format;
import static java.util.Objects.requireNonNull;

/**
 * @author FedorMulashkin
 * @link <a href="https://github.com/FedorMulashkin">My GitHub</a>
 */
public class SourceLine implements Comparable<SourceLine>, CompiledCodeFragment {

    public static final SourceLine EMPTY_SOURCE_LINE = new SourceLine("<UNDEFINED>", 0, List.of());

    private final String moduleName;

    private final int number;

    private final List<String> tokens;

    public SourceLine(final String moduleName, final int number, final List<String> tokens) {
        this.moduleName = requireNonNull(moduleName);
        this.number = number;
        this.tokens = List.copyOf(tokens);
    }

    public String getModuleName() {
        return moduleName;
    }

    public int getNumber() {
        return number;
    }

    public List<String> getTokens() {
        return tokens;
    }

    public String getCommand() {
        return String.join(" ", tokens);
    }

    public String getToken(final int index) {
        return tokens.get(index);
    }

    public int getTokenCount() {
        return tokens.size();
    }

    public String getFirst() {
        return tokens.get(0);
    }

    public String getLast() {
        return tokens.get(getTokenCount() - 1);
    }

    public List<String> subList(final int start, final int end) {
        return tokens.subList(start, end);
    }

    public boolean contains(final String token) {
        return tokens.contains(token);
    }

    public int indexOf(final String token) {
        return tokens.indexOf(token);
    }

    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        final SourceLine that = (SourceLine) o;

        if (getNumber() != that.getNumber()) {
            return false;
        }
        return getModuleName() != null ? getModuleName().equals(that.getModuleName()) : that.getModuleName() == null;
    }

    @Override
    public int hashCode() {
        int result = getModuleName() != null ? getModuleName().hashCode() : 0;
        result = 31 * result + getNumber();
        return result;
    }

    @Override
    public int compareTo(final SourceLine o) {
        final int result = getModuleName().compareTo(o.getModuleName());
        if (result != 0) {
            return result;
        } else {
            return Integer.compare(number, o.number);
        }
    }

    @Override
    public String toString() {
        return format("[%s:%s] -> %s", moduleName, number, getCommand());
    }
}
