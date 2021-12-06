package structural.facade;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Arrays;

import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
class FacadeTest {

    @InjectMocks
    private Facade facade;

    @Mock
    private HttpClient client;

    @Mock
    private Repository repository;

    @Mock
    private Filesystem filesystem;

    @Test
    void shouldDoSomeOperation() {
        when(client.request(anyString())).thenReturn("mocked");
        when(repository.getNumbers()).thenReturn(Arrays.asList(1, 2, 3));
        doNothing().when(filesystem).writeFile(anyString());

        facade.doSomeOperation();

        verify(client).request("127.0.0.1");
        verify(repository).getNumbers();
        verify(filesystem).writeFile("mocked[1, 2, 3]");
    }
}
